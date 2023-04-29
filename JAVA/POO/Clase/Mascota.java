package POO.Clase;

import POO.Interfaz.IProducto;

public class Mascota extends Producto{

    public Mascota(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public String getCategoria() {
        return "Mascotas";
    }

    @Override
    public boolean esCompatible(IProducto p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'esCompatible'");
    }
    
}
