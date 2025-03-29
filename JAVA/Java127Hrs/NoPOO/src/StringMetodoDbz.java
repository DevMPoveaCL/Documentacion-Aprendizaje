/*
    La tarea consiste en crear una clase llamada StringMetodoDbz de la siguiente manera:
    Se requiere desarrollar un programa que reciba los nombres de 3 personajes de DBZ como argumentos de línea de comandos.
    Se pide por cada nombre del personaje una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
    Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
    Ejemplo, un resultado final esperado para los nombres Cell, Freezer y MajinBuu podría ser:
    E.ll_R.er_A.uu
*/
//Version 1.0 ->  @author DevMPoveaCL = Ejercicio práctico relacionado a la utilización de Métodos String.

import java.util.Scanner;

public class StringMetodoDbz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer personaje de DBZ:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese el nombre del segundo personaje de DBZ:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese el nombre del tercer personaje de DBZ:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = "\n¡Felicidades! este es el resultado final: " + nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}
