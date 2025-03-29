package org.mpovea.pooexcepciones.ejemplo;

public class DivisionPorZeroException extends Exception{ //Exception para que quede check, RunTime = NoCheck
    public DivisionPorZeroException (String mensaje){
        super(mensaje);
    }
}
