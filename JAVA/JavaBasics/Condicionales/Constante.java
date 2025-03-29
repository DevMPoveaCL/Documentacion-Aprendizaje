//Version 1.0 ->  @author DevMPoveaCL = Robot que te dice que hacer según la temperatura actual.
package Condicionales;

import java.util.Scanner;

public class Constante {
    // Definimos la constante de temperatura fría
    private static final double TEMP_FRIO = 15.0;

    public static void main(String[] args) {
        // Creamos una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese la temperatura actual
        System.out.println("Ingrese temperatura actual: ");
        // Leemos la temperatura ingresada por el usuario
        double temp = scanner.nextDouble();

        // Comprobamos si hace frío
        if (haceFrio(temp)) {
            // En caso de hacer frío, se enciende la calefacción y se recomienda abrigarse
            ponerCalefaccion(temp);
            abrigarse();
        } else {
            // Si no hace frío, se informa que se puede seguir sin calefacción y con la
            // misma ropa
            todoBien(temp);
        }
        // Cerramos la instancia del Scanner para liberar los recursos
        scanner.close();
    }

    // Método que comprueba si hace frío, recibiendo como parámetro la temperatura
    // actual
    private static boolean haceFrio(double temp) {
        return temp <= TEMP_FRIO;
    }

    // Método que enciende la calefacción, recibiendo como parámetro la temperatura
    // actual
    private static void ponerCalefaccion(double temp) {
        System.out.println("La temperatura es: " + temp + "°C, así que encenderé la calefacción. ");
    }

    // Método que recomienda abrigarse
    private static void abrigarse() {
        System.out.println("Adicionalmente, deberías abrigarte. ");
    }

    // Método que informa que se puede seguir sin calefacción y con la misma ropa
    private static void todoBien(double temp) {
        System.out.println(
                "La temperatura es: " + temp + "°C, así que puedes seguir sin calefacción y con tu misma ropa");
    }

}
