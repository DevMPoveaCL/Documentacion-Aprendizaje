package POO.sOOper.Clase.Contenedor;

import POO.sOOper.Enum.TipoContenedor;
import POO.sOOper.Interfaz.IProducto;

// Clase que representa un contenedor tipo caja, hereda todas las características de Contenedor y las extiende.
public class Caja extends Contenedor {

    private int ancho;
    private int largo;

    // Constructor de la clase, recibe la referencia del contenedor, la altura, el
    // ancho y el largo.
    public Caja(String referencia, int alto, int ancho, int largo) {
        // this."atributo" para los atributos de la clase e ""=" para los argumentos
        // recibidos.
        super(referencia, alto, 0);
        this.ancho = ancho;
        this.largo = largo;
    }

    // Método para obtener la superficie de la caja.
    @Override
    public int getSuperficie() {
        return ancho * largo;
    }

    // Método para obtener el tipo de contenedor.
    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.CAJA;
    }

    // Método que indica si el contenedor resiste el producto especificado, siempre
    // devuelve true.
    @Override
    public boolean resiste(IProducto producto) {
        return true;
    }

}
