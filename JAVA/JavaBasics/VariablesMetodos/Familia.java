//Version 1.0 ->  @author DevMPoveaCL = Ingresar integrantes de una familia.

package VariablesMetodos;

import java.util.Scanner;

public class Familia {
    public static void main(String[] args) {
        // Creamos una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los apellidos de la familia
        System.out.println("Ingrese del apellido paterno: ");
        String apellido1 = scanner.nextLine();

        System.out.println("Ingrese del apellido materno: ");
        String apellido2 = scanner.nextLine();

        // Pedimos al usuario que ingrese los nombres de los hijos, el padre y la madre
        System.out.println("Ingrese el nombre del primer hijo: ");
        String nombreHijo1 = scanner.nextLine();

        System.out.println("Ingrese el nombre del segundo hijo: ");
        String nombreHijo2 = scanner.nextLine();

        System.out.println("Ingrese el nombre del tercer hijo: ");
        String nombreHijo3 = scanner.nextLine();

        System.out.println("Ingrese el nombre del padre: ");
        String nombrePadre = scanner.nextLine();

        System.out.println("Ingrese el nombre de la madre: ");
        String nombreMadre = scanner.nextLine();

        // Concatenamos los apellidos en una sola variable para poder imprimirlos más
        // fácilmente
        String apellidos = apellido1 + " " + apellido2;

        // Imprimimos los nombres de los hijos junto con los apellidos
        System.out.println(String.format("Nombre del segundo hijo: %s %s", nombreHijo1, apellidos));
        System.out.println(String.format("Nombre del primer hijo: %s %s", nombreHijo2, apellidos));
        System.out.println(String.format("Nombre del tercer hijo: %s %s", nombreHijo3, apellidos));

        // Imprimimos el nombre del padre con el apellido1 y el nombre de la madre con
        // el apellido2
        System.out.println(String.format("Nombre del padre: %s %s", nombrePadre, apellido1));
        System.out.println(String.format("Nombre de la madre: %s %s", nombreMadre, apellido2));

        // Cerramos la instancia del Scanner para liberar los recursos
        scanner.close();
    }

}
