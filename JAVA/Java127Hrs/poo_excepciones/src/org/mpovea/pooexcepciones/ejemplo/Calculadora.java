package org.mpovea.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir (int numerador, int divisor) throws DivisionPorZeroException { // separar por coma para + Ex.
        if (divisor == 0){
            throw new DivisionPorZeroException("No se puede dividir por cero");
        }
        return numerador / (double)divisor;
    }
}
