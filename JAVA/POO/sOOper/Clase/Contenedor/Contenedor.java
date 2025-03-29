package POO.sOOper.Clase.Contenedor;

import java.util.HashSet;
import java.util.Set;

import POO.sOOper.Interfaz.IContenedor;
import POO.sOOper.Interfaz.IProducto;

public abstract class Contenedor implements IContenedor {

    // atributos de la clase Contenedor
    private String referencia;
    private int alto;
    private int resistencia;
    private Set<IProducto> productos;

    // constructor de la clase Contenedor
    public Contenedor(String referencia, int alto, int resistencia) {
        this.referencia = referencia;
        this.alto = alto;
        this.resistencia = resistencia;
        productos = new HashSet<IProducto>();
    }

    // método getter para la referencia del contenedor
    @Override
    public String getReferencia() {
        return referencia;
    }

    // método para calcular el volumen del contenedor
    @Override
    public int getVolumen() {
        return alto * getSuperficie();
    }

    // método para calcular el volumen disponible en el contenedor
    @Override
    public int volumenDisponible() {
        return getVolumen() - volumenOcupado();
    }

    // método privado para calcular el volumen ocupado en el contenedor
    private int volumenOcupado() {
        int res = 0;
        for (IProducto p : productos) {
            res += p.getVolumen();
        }
        return res;
    }

    // método getter para la resistencia del contenedor
    @Override
    public int getResistencia() {
        return resistencia;
    }

    // método getter para la lista de productos del contenedor
    @Override
    public Set<IProducto> getProducto() {
        return productos;
    }

    // método para añadir un producto al contenedor
    @Override
    public boolean meter(IProducto producto) {
        boolean resistenciaOk = resiste(producto);
        boolean volumenOk = producto.tengoEspacio(this);
        boolean compatibilidadOk = true;

        // Comprobamos si el producto a añadir es compatible con los productos ya
        // existentes en el contenedor.
        for (IProducto p : productos) {
            boolean compatibleOk = producto.esCompatible(p);
            compatibilidadOk &= compatibleOk;
        }

        // Comprobamos si se cumplen las condiciones para añadir el producto.
        boolean acepta = resistenciaOk && volumenOk && compatibilidadOk;
        if (acepta) {
            productos.add(producto);
            producto.meter(this);
        }
        return acepta;
    }

    // método para comprobar si el contenedor resiste un producto
    @Override
    public boolean resiste(IProducto producto) {
        return resistencia > producto.getPeso();
    }

    // método para representar el contenedor como una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contenedor " + referencia + " [" + getTipo() + " ] (sup "
                + getSuperficie() + "cm2 - vol " + getVolumen() + "cm3 - resistencia " + getResistencia() + " g).\n");
        if (productos.isEmpty()) {
            sb.append("\t\tvacío\n");
        }
        for (IProducto p : productos) {
            sb.append("\t\t" + p + "\n");
        }
        sb.append("\t\t>> Disponible vol " + volumenDisponible() + "cm3");
        return sb.toString();
    }

}
