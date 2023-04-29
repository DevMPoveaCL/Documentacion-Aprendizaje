package POO.Clase;

import POO.Interfaz.IProducto;

public class Drogueria extends Producto {

    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public String getCategoria() {
        return "Droguería";
    }

    @Override
    public boolean esCompatible(IProducto p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esCompatible'");
    }

}
