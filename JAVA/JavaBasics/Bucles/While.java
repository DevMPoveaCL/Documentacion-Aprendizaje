//Version 1.0 ->  @author DevMPoveaCL = Calcula un número factorial usando while y una constante.

package Bucles;

public class While {
    // Constante que indica el número del cual se calculará el factorial
    private static final int NUM = 5;

    public static void main(String[] args) {
        // Variable que almacenará el resultado del cálculo
        int resultado = 1;
        int i = 1;
        while (i <= NUM) {
            // La "magia" del factorial "*="
            resultado *= i;
            i++;
        }

        System.out.println("El factorial de " + NUM + " es " + resultado);
    }
}
