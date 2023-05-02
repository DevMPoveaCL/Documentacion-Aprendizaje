//Version 1.0 ->  @author DevMPoveaCL = Calcula cuantos días tiene el determinado mes. 
package Condicionales;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Creamos una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese el número de mes
        System.out.println("Programa para calcular días que tiene el mes");
        System.out.println("Ingresa el número del mes: ");
        int mes = scanner.nextInt();

        // Verificamos si el mes es válido y calculamos los días correspondientes
        if (mes < 1 || mes > 12) {
            System.err.println(mes + " no es un mes válido");
        } else {
            int dia = calculaDia(mes);
            System.out.println("El mes " + mes + " tiene " + dia + " días.");
        }

        // Cerramos la instancia del Scanner para liberar los recursos
        scanner.close();
    }

    /**
     * Método para calcular los días que tiene un mes
     *
     * @param mes el número de mes a calcular
     * @return el número de días correspondientes al mes
     */
    private static int calculaDia(int mes) {
        int dia;

        // Utilizamos un switch para calcular los días correspondientes a cada mes
        switch (mes) {
            case 2:
                dia = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dia = 30;
                break;
            default:
                dia = 31;
                break;
        }

        return dia;
    }
}
