package POO.Clase;

import java.util.Set;

import POO.Interfaz.IContenedor;
import POO.Interfaz.IProducto;

public abstract class Contenedor implements IContenedor {

    private String referencia;
    private int alto;

    public Contenedor(String referencia, int alto) {
        this.referencia = referencia;
        this.alto = alto;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getVolumen() {
        return alto * getSuperficie();
    }

    @Override
    public int volumenDisponible() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volumenDisponible'");
    }

    @Override
    public int getResistencia() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getResistencia'");
    }

    @Override
    public Set<IProducto> getProducto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProducto'");
    }

    @Override
    public boolean meter(IProducto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'meter'");
    }

    @Override
    public boolean resiste(IProducto producto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resiste'");
    }

}
