//Version 1.0 ->  @author DevMPoveaCL = Mostrar cantidad de personas, muebles y expedientes.

package VariablesMetodos;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        // Creamos una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese la cantidad de clientes
        System.out.print("Ingrese el número de Clientes: ");
        int numCliente = scanner.nextInt();

        // Pedimos al usuario que ingrese la cantidad de empleados
        System.out.print("Ingrese el número de Empleados: ");
        int numEmpleado = scanner.nextInt();

        // Pedimos al usuario que ingrese la cantidad de sillas
        System.out.print("Ingrese el número de Sillas: ");
        int numSilla = scanner.nextInt();

        // Pedimos al usuario que ingrese la cantidad de mesas
        System.out.print("Ingrese el número de Mesas: ");
        int numMesa = scanner.nextInt();

        // Pedimos al usuario que ingrese la cantidad de contratos
        System.out.print("Ingrese el número de Contratos: ");
        int numContrato = scanner.nextInt();

        // Pedimos al usuario que ingrese la cantidad de reclamaciones
        System.out.print("Ingrese el número de Reclamaciones: ");
        int numReclamacion = scanner.nextInt();

        // Calculamos la cantidad total de personas, muebles y expedientes
        int numPersona = suma(numCliente, numEmpleado);
        int numMueble = suma(numSilla, numMesa);
        int numExpediente = suma(numContrato, numReclamacion);

        // Mostramos en pantalla la cantidad total de personas, muebles y expedientes
        System.out.println(
                "Tenemos " + numPersona + " personas, " + numMueble + " muebles y " + numExpediente + " expedientes.");

        // Cerramos la instancia del Scanner para liberar los recursos
        scanner.close();
    }

    /**
     * Método que suma dos números enteros y devuelve el resultado.
     *
     * @param a El primer número a sumar.
     * @param b El segundo número a sumar.
     * @return La suma de a y b.
     */
    private static int suma(int a, int b) {
        return a + b;
    }
}
