package POO.sOOper.Interfaz;

public interface IProducto {
    String getReferencia();

    int getPeso();

    int getVolumen();

    String getCategoria();

    boolean esCompatible(IProducto p);

    boolean tengoEspacio(IContenedor contenedor);
}
