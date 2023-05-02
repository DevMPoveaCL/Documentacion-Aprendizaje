package POO.sOOper.Clase;

import POO.sOOper.Interfaz.IProducto;

public class Higiene extends Producto {

    public Higiene(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public String getCategoria() {
        return "Higiene";
    }

    @Override
    public boolean esCompatible(IProducto p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esCompatible'");
    }

}
