//Version 1.0 ->  @author DevMPoveaCL = cambiar a "Mayús" <5 caracteres o de lo contrario, "Minus". 
package Bucles;

public class ForEach {
    // Constante
    private static final int LIM = 5;

    public static void main(String[] args) {
        // Array que se pasará al forEach
        String[] continentes = { "América", "Asia", "Europa", "Oceanía", "África" };
        System.out.println("\nLos continentes son: \n");
        for (String continent : continentes) {
            // Longitud menor a la constante se convierte en Mayús
            if (continent.length() < LIM) {
                System.out.println(continent.toUpperCase());
            } else {
                // De lo contrario Minus
                System.out.println(continent.toLowerCase());
            }
        }
    }
}
