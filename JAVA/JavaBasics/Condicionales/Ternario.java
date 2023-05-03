//Version 1.0 ->  @author DevMPoveaCL = Valor absoluto sin lllamar colecciones, solo ternario.
package Condicionales;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número a calcular su valor absoluto");
        float num = sc.nextFloat();
        // operador ternario para calcular el valor absoluto
        float num_abs = num > 0 ? num : -num;
        System.out.println("El valor absoluto de " + num + " es: " + num_abs);
        sc.close();
    }
}
