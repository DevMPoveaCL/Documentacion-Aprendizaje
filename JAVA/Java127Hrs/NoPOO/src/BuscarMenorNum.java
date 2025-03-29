/*
Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el numero
de veces (ingresado) para pedir el numero entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir
"el numero menor es igual o mayor que 10!".*/

import java.util.Scanner;

//Version 1.0 ->  @author DevMPoveaCL = Flujos de control - Buscar el menor de 10 valores enteros
public class BuscarMenorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0; // Inicializamos con un valor por defecto

        // Bucle para validar la entrada del usuario
        // Continuará hasta que la entrada sea válida (número mayor o igual a 10)
        for (boolean entradaValida = false; !entradaValida; ) {
            try {
                System.out.print("Ingrese la cantidad de números a comparar: ");
                cantidad = Integer.parseInt(sc.nextLine());

                if (cantidad >= 10) {
                    entradaValida = true; // Si el número es válido, salimos del bucle
                } else {
                    System.out.println("El número debe ser mayor o igual a 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debes ingresar un número entero.");
            }
        }

        int menor = Integer.MAX_VALUE; // Inicializar el número menor con un valor máximo
        int numero;

        // Bucle para ingresar y comparar los números
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ": ");
            numero = sc.nextInt();
            menor = (numero < menor) ? numero : menor; // Actualizar el número menor si es necesario
        }

        System.out.println("El número menor es: " + menor+ "\n");

        if (menor < 10) {
            System.out.println("El número " + menor + " es menor que 10!");
        } else {
            System.out.println("El número " + menor + " es igual o mayor que 10!");
        }
    }
}
