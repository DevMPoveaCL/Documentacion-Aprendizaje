//Version 1.0 ->  @author DevMPoveaCL = Calcular el área de un rectángulo.

package VariablesMetodos;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        // Creamos una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el valor de ladoX
        System.out.print("Ingrese el valor de ladoX: ");
        int ladoX = scanner.nextInt();

        // Solicitamos al usuario que ingrese el valor de ladoY
        System.out.print("Ingrese el valor de ladoY: ");
        int ladoY = scanner.nextInt();

        // Calculamos el área del rectángulo utilizando los valores ingresados por el
        // usuario
        int area = ladoX * ladoY;

        // Mostramos el resultado al usuario
        System.out.println("El rectángulo de " + ladoX + " por " + ladoY + " tiene un área de " + area);

        // Cerramos la instancia del Scanner para liberar los recursos
        scanner.close();
    }
}
