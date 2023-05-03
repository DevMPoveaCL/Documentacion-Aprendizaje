package Bucles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ki = 8500;
        int i = 0;

        System.out.println("\n¡Gohan está tratando de vencer a Cell! Ayúdalo a aumentar su Ki.");

        do {
            i = 0;
            String respuestaUsuario;
            do {
                i++;
                System.out.println("su Ki actual es de: " + ki + "\n");
                System.out.print("¿Quieres que Gohan siga aumentando su Ki? (S/N): \n");
                respuestaUsuario = sc.next();
                ki += respuestaUsuario.equalsIgnoreCase("s") ? 200 : 0;
            } while (respuestaUsuario.equalsIgnoreCase("S") && ki < 9500);

            if (ki >= 9000 && ki < 9500) {
                System.out.println("\n Ahoraa Gohan!!!!!... ggggh Ah!!!!!!!!! (sonido épico)");
                System.out.println("¡Felicidades insecto! Gohan venció a Cell gracias a tu ayuda!");
                System.out.println("¡Has salvado la Tierra!");
                return;
            } else if (ki == 9500) {
                System.out.println(
                        "\nRecuerdas a Krillin en la saga de Freezer?...Pues Felicidades! Gohan acaba de explotar :D");
                System.out.println("No le des tanto Ki que se sobrecarga el pobre U.u");
                System.exit(0);

            }
            System.out.println("\nFelicidades... Gohan falló por tu culpa!");
            System.out.println("Cell destruyó la Tierra -.-");
            System.out.println("Para la próxima, brindale más Ki.\n");
            System.out.print("¿Quieres volver a intentarlo? (S/N): ");
            ki = 8500;
        } while (sc.next().equalsIgnoreCase("S"));
    }
}