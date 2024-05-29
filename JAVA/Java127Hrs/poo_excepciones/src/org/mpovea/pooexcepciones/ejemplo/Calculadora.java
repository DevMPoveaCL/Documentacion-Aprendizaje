package org.mpovea.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir (int numerador, int divisor) throws DivisionPorZeroException { // separar por coma para + Ex.
        if (divisor == 0){
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return numerador / (double)divisor;
    }

    public double dividir (String numerador, String divisor)
            throws DivisionPorZeroException, FormatoNumeroException { // Separación por coma correcta.

        try{
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException nfe) {
            throw new FormatoNumeroException("debe ingresar un número en el numerador y divisor");
        }

    }

}
