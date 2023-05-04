package POO.sOOper.Interfaz;

import java.util.Set;

import POO.sOOper.Enum.TipoContenedor;

public interface IContenedor {
    String getReferencia();

    int getVolumen();

    int getSuperficie();

    int volumenDisponible();

    int getResistencia();

    Set<IProducto> getProducto();

    TipoContenedor getTipo();

    boolean meter(IProducto producto);

    boolean resiste(IProducto producto);

}
