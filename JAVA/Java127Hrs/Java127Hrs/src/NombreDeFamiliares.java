/*
    La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
    Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
    Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
    Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
    Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
    N.es_A.ia_E.pe
*/
//Version 1.0 ->  @author DevMPoveaCL = Ejercicio relacionado al detalle de una factura simple.

import java.util.Scanner;

public class NombreDeFamiliares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre de un familiar:");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("Ingrese otro nombre de un familiar:");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        String resultado = nombreA2 + "_" + nombreB2 + "_" + nombreC2;

        System.out.println(resultado);
    }
}
