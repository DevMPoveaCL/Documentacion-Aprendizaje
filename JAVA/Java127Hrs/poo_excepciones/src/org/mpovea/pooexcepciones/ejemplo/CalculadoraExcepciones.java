package org.mpovea.pooexcepciones.ejemplo;

import javax.swing.*;

public class CalculadoraExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");
        int divisor;
        double division;

        try { //Todo lo que se quiere manejar en las excepciones.
            /*divisor = Integer.parseInt(valor); // Transforma a valor numérico el String anterior
            division = cal.dividir(10, divisor) ;
            System.out.println(division);*/

            double division2 = cal.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);
        /*} catch (NumberFormatException nfe) { //Tipo de excepción, msje y qué hacer.
            System.out.println("Se detectó una excepción: Por favor, ingrese un valor numérico: " + nfe.getMessage());
            main(args);*/
        } catch (FormatoNumeroException fne) {
            System.out.println("Se detectó una excepción: Por favor, ingrese un número válido: " + fne.getMessage());
            fne.printStackTrace(System.out);
        }
        catch (DivisionPorZeroException dpze) { //resultado no cambia, pero en la práctica si es más específico.
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + dpze.getMessage());
            main(args);
        }finally { //Tarea que se ejecuta siempre independiente de que ocurra o no el error
            System.out.println("Ejemplo: finalizar una conexión cuando ocurre el error, opcional");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!" );

    }
}
