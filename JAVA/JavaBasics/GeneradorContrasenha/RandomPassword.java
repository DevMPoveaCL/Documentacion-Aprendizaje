//Version 1.0 ->  @author DevMPoveaCL = Genera Contraseñas aleatorias.
package GeneradorContrasenha;

import java.util.Scanner;

public class RandomPassword {
    // Se definen las opciones para cada tipo de carácter que puede haber en la
    // contraseña
    private static final String CONSONANTE = "bcdfghjklmnpqrstvwxyz";
    private static final String VOCAL = "aeiou";
    private static final String NUMERO = "0123456789";
    private static final String SIMBOLO = "!@#$&/\\°()=?*+-,;.:><\"";

    // Se definen las cantidades de cada tipo de carácter que tendrá la contraseña
    private static final int NUM_PARES = 3;
    private static final int NUM_NUMS = 2;
    private static final int NUM_SIMB = 1;

    // Se definen otras constantes necesarias
    private static final String OTRA = "N"; // Cadena que el usuario puede ingresar para pedir otra contraseña
    private static final double PROBABILIDAD = 0.45; // Probabilidad de que un par sea consonante-vocal o
                                                     // vocal-consonante

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("---------------------------------------");
        System.out.println("Bienvenido al generador de contraseñas: ");

        do {
            String password = "";
            // Se generan los tres pares consonante-vocal
            for (int i = 0; i < NUM_PARES; i++) {
                password += generaPar();
            }
            // Se generan los dos números
            for (int i = 0; i < NUM_NUMS; i++) {
                password += getAlea(NUMERO);
            }
            // Se genera el símbolo especial
            for (int i = 0; i < NUM_SIMB; i++) {
                password += getAlea(SIMBOLO);
            }
            // Se muestra la contraseña generada y se pregunta si el usuario quiere otra
            System.out.println("---------------------------------------");
            System.out.println("La contraseña propuesta es: \n\t" + password
                    + "\n\nSi no le convence y quiere otra pulse " + OTRA);
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase(OTRA)); // Se repite hasta que el usuario esté satisfecho con la contraseña
                                                    // generada
        System.out.println("---------------------------------------");
        System.out.println("Perfecto, su constraseña ha sido guardada :)");
        sc.close();
    }

    // Genera un carácter aleatorio a partir de una cadena de opciones
    private static char getAlea(String opciones) {
        int posicion = (int) (Math.random() * opciones.length());
        return opciones.charAt(posicion);
    }

    // Genera un par consonante-vocal o vocal-consonante
    private static String generaPar() {
        String par = "";
        if (Math.random() < PROBABILIDAD) {
            par += getAlea(CONSONANTE);
            par += getAlea(VOCAL);
        } else {
            par += getAlea(VOCAL);
            par += getAlea(CONSONANTE);
        }
        return par;
    }
}
