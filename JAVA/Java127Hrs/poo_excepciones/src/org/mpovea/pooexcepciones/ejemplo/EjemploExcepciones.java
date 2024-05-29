package org.mpovea.pooexcepciones.ejemplo;

import javax.swing.*;

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

        String valor = JOptionPane.showInputDialog("Ingrese un entero: "); // valor no numérico

        try { //Todo lo que se quiere manejar en las excepciones.
            int divisor = Integer.parseInt(valor); // Transforma a valor numérico el String anterior
            int division = 10 / divisor;
            System.out.println(division);
        } catch (NumberFormatException nfe){ //Tipo de excepción, msje y qué hacer.
            System.out.println("Se detectó una excepción: Por favor, ingrese un valor numérico: " + nfe.getMessage());
            main(args);
        }
        catch (ArithmeticException ae) { //resultado no cambia, pero en la práctica si es más específico.
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
            main(args);
        }finally { //Tarea que se ejecuta siempre independiente de que ocurra o no el error
            System.out.println("Ejemplo: finalizar una conexión cuando ocurre el error, opcional");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!" );

    }


}
