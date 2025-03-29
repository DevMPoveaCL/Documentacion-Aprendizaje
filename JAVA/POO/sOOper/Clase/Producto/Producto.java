package POO.sOOper.Clase.Producto;

import POO.sOOper.Interfaz.IContenedor;
import POO.sOOper.Interfaz.IProducto;

public abstract class Producto implements IProducto {

    // Atributos
    private String referencia; // Referencia única del producto
    private int peso; // Peso del producto
    private int volumen; // Volumen que ocupa el producto en metros cúbicos
    private IContenedor contenedor; // Contenedor donde está almacenado el producto

    // Constructor
    public Producto(String referencia, int peso, int volumen) {
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    // Métodos de la interfaz IProducto
    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        return contenedor.volumenDisponible() > volumen;
    }

    @Override
    public void meter(IContenedor contenedor) {
        this.contenedor = contenedor;
    }

    // Métodos propios de la clase
    @Override
    public String toString() {
        return "Producto [categoria=" + getCategoria() + ", referencia=" + referencia + ", peso=" + peso + ", volumen="
                + volumen + ", contenedor=" + contenedor.getReferencia() + "]";
    }

}
