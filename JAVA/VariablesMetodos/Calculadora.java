//Version 1.0 ->  @author DevMPoveaCL = Calculadora básica de dos números.

package VariablesMetodos;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        // Pedir al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        // Mostrar un menú de opciones y pedir al usuario que elija una
        System.out.println("\n¿Qué operación desea realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese su opción (1-4): ");

        int opcion = scanner.nextInt();

        // Realizar la operación seleccionada por el usuario y mostrar el resultado
        switch (opcion) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + suma(num1, num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + resta(num1, num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        scanner.close();
    }

    // Método para sumar dos números
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    // Método para restar dos números
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicar dos números
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    // Método para dividir dos números
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            // Lanzar una excepción si el divisor es cero
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
}
