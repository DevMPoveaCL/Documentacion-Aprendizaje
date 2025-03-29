package POO.sOOper.Clase.Producto;

import POO.sOOper.Enum.Categoria;
import POO.sOOper.Interfaz.IProducto;

public class Mascota extends Producto {

    // Constructor de la clase
    public Mascota(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    // Método que devuelve la categoría del producto como "MASCOTA"
    @Override
    public Categoria getCategoria() {
        return Categoria.MASCOTA;
    }

    // Método que comprueba si el producto es compatible con otro producto
    @Override
    public boolean esCompatible(IProducto p) {
        // Un producto para mascotas es compatible con otro producto para mascotas o con
        // un producto de higiene
        return Categoria.MASCOTA.equals(p.getCategoria()) || Categoria.HIGIENE.equals(p.getCategoria());
    }

}
