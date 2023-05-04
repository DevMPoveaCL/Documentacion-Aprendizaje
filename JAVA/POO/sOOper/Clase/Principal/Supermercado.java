package POO.sOOper.Clase.Principal;

import POO.sOOper.Clase.Contenedor.Bolsa;
import POO.sOOper.Clase.Contenedor.Caja;
import POO.sOOper.Clase.Producto.Congelado;
import POO.sOOper.Clase.Producto.Fresco;
import POO.sOOper.Clase.Producto.Higiene;
import POO.sOOper.Interfaz.IContenedor;
import POO.sOOper.Interfaz.IPedido;
import POO.sOOper.Interfaz.IProducto;

public class Supermercado {
    public static void main(String[] args) {
        IPedido miPedido = new Pedido("pedido001");

        IContenedor bolsa1 = new Bolsa("B111", 40, 25, 900);
        IContenedor caja1 = new Caja("C222", 30, 50, 70);
        miPedido.addContenedor(bolsa1);
        miPedido.addContenedor(caja1);
        System.out.println("Bolsa: " + bolsa1);
        System.out.println("Caja: " + caja1);
        System.out.println("Mi pedido con contenedores: " + miPedido);

        IProducto manzana = new Fresco("MNZ", 1000, 1500);
        IProducto helado = new Congelado("HLD", 8000, 1000);
        IProducto confort = new Higiene("CFT", 500, 2500);
        IProducto pera = new Fresco("PER", 800, 1200);

        IContenedor contManzana = miPedido.addProducto(manzana);
        IContenedor contHelado = miPedido.addProducto(helado);
        IContenedor contConfort = miPedido.addProducto(confort);
        IContenedor contPera = miPedido.addProducto(pera);
        System.out.println("Mi pedido con productos: " + miPedido);
    };
}
