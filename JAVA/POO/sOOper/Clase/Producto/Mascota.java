package POO.sOOper.Clase.Producto;

import POO.sOOper.Enum.Categoria;
import POO.sOOper.Interfaz.IProducto;

public class Mascota extends Producto {

    public Mascota(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.MASCOTA;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return Categoria.MASCOTA.equals(p.getCategoria()) || Categoria.HIGIENE.equals(p.getCategoria());
    }

}
