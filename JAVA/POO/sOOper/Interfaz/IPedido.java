package POO.sOOper.Interfaz;

import java.util.Set;

public interface IPedido {

    // Métodos
    String getReferencia();

    Set<IProducto> getProducto();

    Set<IContenedor> getContenedor();

    void addContenedor(IContenedor contenedor);

    IContenedor addProducto(IProducto producto);
}
