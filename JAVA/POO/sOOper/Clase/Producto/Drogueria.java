package POO.sOOper.Clase.Producto;

import POO.sOOper.Enum.Categoria;
import POO.sOOper.Interfaz.IProducto;

public class Drogueria extends Producto {

    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.DROGERIA;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return false;
    }

}
