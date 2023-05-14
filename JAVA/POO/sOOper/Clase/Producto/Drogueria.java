package POO.sOOper.Clase.Producto;

import POO.sOOper.Enum.Categoria; // Se importa el enum "Categoria" desde el paquete correspondiente
import POO.sOOper.Interfaz.IProducto; // Se importa la interfaz "IProducto" desde el paquete correspondiente

public class Drogueria extends Producto {

    // Se llama al constructor de la superclase "Producto"
    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    // Se devuelve la categoría "DROGERIA" del enum "Categoria"
    @Override
    public Categoria getCategoria() {
        return Categoria.DROGERIA;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        // Un producto de droguería es compatible si no es de alimentación ni de
        // mascotas
        return !Categoria.ALIMENTACION.equals(p.getCategoria()) && !Categoria.MASCOTA.equals(p.getCategoria());
    }

}
