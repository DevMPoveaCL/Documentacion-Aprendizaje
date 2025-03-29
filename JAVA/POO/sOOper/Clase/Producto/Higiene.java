package POO.sOOper.Clase.Producto;

import POO.sOOper.Enum.Categoria;
import POO.sOOper.Interfaz.IProducto;

public class Higiene extends Producto {

    public Higiene(String referencia, int peso, int volumen) {
        // Llama al constructor de la clase padre con los parámetros especificados
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        // Devuelve la categoría del producto, en este caso HIGIENE
        return Categoria.HIGIENE;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        // Verifica si el producto especificado es de la categoría ALIMENTACION, si es
        // así, no es compatible
        return !Categoria.ALIMENTACION.equals(p.getCategoria());
    }

}
