package POO.sOOper.Clase.Principal;

import java.util.HashSet;
import java.util.Set;

import POO.sOOper.Interfaz.IContenedor;
import POO.sOOper.Interfaz.IPedido;
import POO.sOOper.Interfaz.IProducto;

// Clase que representa un pedido
public class Pedido implements IPedido {
    private String referencia; // Referencia del pedido
    private Set<IContenedor> contenedores; // Conjunto de contenedores que contiene el pedido

    // Constructor que recibe la referencia del pedido
    public Pedido(String referencia) {
        this.referencia = referencia;
        this.contenedores = new HashSet<IContenedor>();
    }

    // Obtiene la referencia del pedido
    @Override
    public String getReferencia() {
        return referencia;
    }

    // Obtiene los productos del pedido
    @Override
    public Set<IProducto> getProducto() {
        Set<IProducto> productos = null;
        for (IContenedor c : contenedores) {
            if (productos == null) {
                productos = c.getProducto();
            } else {
                productos.addAll(c.getProducto());
            }
        }
        return productos;
    }

    // Obtiene los contenedores del pedido
    @Override
    public Set<IContenedor> getContenedor() {
        return contenedores;
    }

    // Agrega un contenedor al pedido
    @Override
    public void addContenedor(IContenedor contenedor) {
        contenedores.add(contenedor);
    }

    // Agrega un producto al pedido y retorna el contenedor donde fue agregado
    @Override
    public IContenedor addProducto(IProducto producto) {
        for (IContenedor contenedor : contenedores) {
            if (contenedor.meter(producto)) {
                return contenedor;
            }
        }
        return null;
    }

    // Retorna una representación en cadena del objeto Pedido
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido: " + referencia + "\n");
        for (IContenedor contenedor : contenedores) {
            sb.append("\t" + contenedor + "\n");
        }
        return sb.toString();
    }
}
