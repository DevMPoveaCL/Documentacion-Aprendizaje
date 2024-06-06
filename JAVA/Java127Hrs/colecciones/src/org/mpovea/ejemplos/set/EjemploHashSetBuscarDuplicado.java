package org.mpovea.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {
        String [] peces = {"Corvina", "Lenguado", "Pejerrey", "Róbalo", "Atún", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for (String pez : peces) { //Agrega elementos
            if (!unicos.add(pez)) { // Identifica duplicados, el booleano retornará true siempre que no esté duplicado
                duplicados.add(pez); // Agrega solo los que se escriben estrictamente igual
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Unicos: " + unicos);
        System.out.println("Duplicados: " + duplicados);
    }
}
