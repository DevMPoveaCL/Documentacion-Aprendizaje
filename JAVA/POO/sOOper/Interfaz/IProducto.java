package POO.sOOper.Interfaz;

import POO.sOOper.Enum.Categoria;

public interface IProducto {
    String getReferencia();

    int getPeso();

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible(IProducto p);

    boolean tengoEspacio(IContenedor contenedor);

    void meter(IContenedor contenedor);
}
