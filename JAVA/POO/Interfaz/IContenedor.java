package POO.Interfaz;

import java.util.Set;

public interface IContenedor {
    String getReferencia();

    int getVolumen();

    int getSuperficie();

    int volumenDisponible();

    int getResistencia();

    Set<IProducto> getProducto();

    String getTipo();

    boolean meter(IProducto producto);

    boolean resiste(IProducto producto);
}
