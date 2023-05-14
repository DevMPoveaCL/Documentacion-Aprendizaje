package POO.sOOper.Clase.Producto;

import POO.sOOper.Enum.Categoria;
import POO.sOOper.Interfaz.IProducto;

public class Alimentacion extends Producto {

    // Constructor de la clase "Alimentacion" que llama al constructor de la clase
    // "Producto".
    public Alimentacion(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    // Override del método "getCategoria()" de la clase base "Producto"
    @Override
    public Categoria getCategoria() {
        return Categoria.ALIMENTACION;
    }

    // Verifica si el producto es compatible con la alimentación, es decir, si es
    // también de la categoría "Alimentacion".
    @Override
    public boolean esCompatible(IProducto p) {
        return Categoria.ALIMENTACION.equals(p.getCategoria());
    }

}
