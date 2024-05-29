package org.mpovea.pooexcepciones.ejemplo;

public class EjemploExcepciones {
    public static void main(String[] args) {

        /*try {
            int division = 10 / 0;
            System.out.println(division);
        } catch (Exception e) { //No es recomendable hacerlo tan general, se debe manejar la excepción por su tipo
                                // en lugar de "Exception".
        System.out.println("Capturamos la excepción en tiempo de ejecución: " + e.getMessage());
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!" );*/
        try {
            int division = 10 / 0;
            System.out.println(division);
        } catch (ArithmeticException ae) { //resultado no cambia, pero en la práctica si es más específico.
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!" );
    }


}
