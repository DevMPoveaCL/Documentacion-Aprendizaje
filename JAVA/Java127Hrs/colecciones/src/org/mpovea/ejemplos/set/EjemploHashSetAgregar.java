package org.mpovea.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        //Cada .add retorna un boolean (true / false).
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs);

        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados = " + b);
        System.out.println(hs);
    }
}
