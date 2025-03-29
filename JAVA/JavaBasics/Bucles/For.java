//Version 1.0 ->  @author DevMPoveaCL = muestra el índice y el elemento del array (llave, valor)

package Bucles;

public class For {
    public static void main(String[] args) {
        // Posiciones: {0,1,2,3}
        String[] elemental = { "Agua", "Fuego", "Tierra", "Viento" };
        System.out.println("\nLos elementos en avatar son: \n");

        // ciclo for que recorre el arreglo de elementos
        for (int i = 0; i < elemental.length; i++) {
            // se guarda el nombre del elemento actual en una variable
            String element = elemental[i];
            // se muestra el índice y el nombre del elemento actual
            System.out.println(i + ") " + element);
        }
    }
}
