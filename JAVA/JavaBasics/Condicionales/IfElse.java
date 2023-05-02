//Version 1.0 ->  @author DevMPoveaCL = Mostrar Temperatura Positiva o Negativa en grados celsius. 
package Condicionales;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Creamos una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mensaje de bienvenida e instrucciones para el usuario
        System.out.println("Programa que muestra la temperatura actual en grados Celsius");
        System.out.println("Ingresa el número de la temperatura actual.");
        System.out.println("En caso de ser negativa, antepone un signo negativo al número (-): ");

        // Leer la temperatura del usuario
        int temperatura = scanner.nextInt();

        // Mostrar la temperatura en grados Celsius con un mensaje de acuerdo a si es
        // positiva, cero o negativa
        System.out.println("La temperatura es de: ");
        if (temperatura > 0) {
            System.out.println(temperatura + " °C positivos.");
        } else if (temperatura == 0) {
            System.out.println("0° bajo cero");
        } else {
            System.out.println(temperatura + " °C negativos.");
        }

        // Cerramos la instancia del Scanner para liberar los recursos
        scanner.close();
    }

}
