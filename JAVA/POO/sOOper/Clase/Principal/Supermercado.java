package POO.sOOper.Clase.Principal;

import java.time.LocalDate;

import POO.sOOper.Clase.Contenedor.Bolsa;
import POO.sOOper.Clase.Contenedor.Caja;
import POO.sOOper.Clase.Producto.Congelado;
import POO.sOOper.Clase.Producto.Drogueria;
import POO.sOOper.Clase.Producto.Fresco;
import POO.sOOper.Clase.Producto.Higiene;
import POO.sOOper.Clase.Producto.Mascota;
import POO.sOOper.Clase.Producto.NoPerecedero;
import POO.sOOper.Interfaz.IContenedor;
import POO.sOOper.Interfaz.IPedido;
import POO.sOOper.Interfaz.IProducto;

public class Supermercado {
    public static void main(String[] args) {
        // Crear un objeto de Pedido
        IPedido miPedido = new Pedido("pedido001");

        // Crear objetos de Contenedor y agregarlos al pedido
        IContenedor bolsa1 = new Bolsa("B111", 40, 25, 3000);
        IContenedor caja1 = new Caja("C222", 30, 30, 40);

        // Agregamos los contenedores al pedido
        miPedido.addContenedor(bolsa1);
        miPedido.addContenedor(caja1);

        // Creamos algunas cajas y bolsas adicionales para agregarlas al pedido
        for (int i = 0; i < 2; i++) {
            IContenedor caja = new Caja("C23" + i, 30, 40, 30);
            miPedido.addContenedor(caja);
        }
        for (int i = 0; i < 2; i++) {
            IContenedor bolsa = new Bolsa("B12" + i, 3000, 30, 2500);
            miPedido.addContenedor(bolsa);
        }

        for (int i = 0; i < 2; i++) {
            IContenedor bolsa = new Bolsa("B13" + i, 2000, 25, 1500);
            miPedido.addContenedor(bolsa);
        }

        // Agregamos una caja grande al pedido
        miPedido.addContenedor(new Caja("C333", 50, 60, 75)); // caja grande

        // Crear objetos de Producto y agregarlos al pedido
        IProducto manzana = new Fresco("MNZ", 1000, 1500, LocalDate.now().plusDays(7));
        IProducto helado = new Congelado("HLD", 800, 1000);
        IProducto confort = new Higiene("CFT", 500, 2500);
        IProducto pera = new Fresco("PER", 800, 1200, LocalDate.now().plusDays(5));

        // Agregamos los productos a los contenedores correspondientes en el pedido
        IContenedor contManzana = miPedido.addProducto(manzana);
        IContenedor contHelado = miPedido.addProducto(helado);
        IContenedor contConfort = miPedido.addProducto(confort);
        IContenedor contPera = miPedido.addProducto(pera);

        // Se añaden 12 objetos de tipo NoPerecedero con nombre "LCH0" al "LCH11" al
        // pedido
        for (int i = 0; i < 12; i++) {
            IProducto leche = new NoPerecedero("LCH" + i, 6600, 7000);
            miPedido.addProducto(leche);
        }

        // Se añaden 4 objetos de diferentes tipos de productos al pedido
        miPedido.addProducto(new Mascota("GAT", 5000, 10000)); // comida para el gato
        miPedido.addProducto(new Mascota("PER1", 10000, 20000)); // comida para el perro
        miPedido.addProducto(new Higiene("GEL", 1500, 1600)); // gel de ducha
        miPedido.addProducto(new Drogueria("DET", 2000, 1600)); // detergente lavadora

        // Se añaden 24 objetos de tipo Fresco con nombre "YOG0" al "YOG23" al pedido,
        // con fechas de caducidad desde hoy hasta 23 días después
        for (int i = 0; i < 24; i++) {
            miPedido.addProducto(new Fresco("YOG" + i, 250, 300, LocalDate.now().plusDays(i))); // yogur
        }

        // Se imprime en consola una representación del pedido con los productos
        // añadidos
        System.out.println("\nMi pedido con productos: " + miPedido);
    };
}
