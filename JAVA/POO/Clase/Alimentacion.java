package POO.Clase;

import POO.Interfaz.IProducto;

public class Alimentacion extends Producto {

    public Alimentacion(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public String getCategoria() {
        return "Alimentación";
    }

    @Override
    public boolean esCompatible(IProducto p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esCompatible'");
    }

}
