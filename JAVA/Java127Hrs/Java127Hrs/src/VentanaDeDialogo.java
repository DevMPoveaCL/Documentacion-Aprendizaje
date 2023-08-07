//Version 1.0 ->  @author DevMPoveaCL = ingreso de número entero con ventada de dialogo.

import javax.swing.*;

public class VentanaDeDialogo {
    public static void main(String[] args) {

        //Abre la ventana de diálogo y guarda la variable ingresada.
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        //Manejo de excepción distinto a número (básico).
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
        main(args); //recursividad del main (lo repite)
        System.exit(0); //termina el proceso con status 0 ("status 0" = sin problemas)
        }

        System.out.println("numeroDecimal = " + numeroDecimal);
        //ventana de dialogo
        JOptionPane.showMessageDialog(null, "Número entero ingresado con éxito");
    }
}
