//Version 1.0 ->  @author DevMPoveaCL = Ejemplos más comunes de String y sus métodos.

public class EjemploStringMetodos {
    public static void main(String[] args) {

        // Definir una cadena de caracteres
        String nombre = "Andres";

        // Obtener la longitud de la cadena
        System.out.println("nombre.length() = " + nombre.length());

        // Convertir la cadena a mayúsculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // Convertir la cadena a minúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // Verificar si la cadena es igual a "Andres"
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));

        // Verificar si la cadena es igual a "andres"
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));

        // Verificar si la cadena es igual a "andres" (ignorando mayúsculas y minúsculas)
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));

        // Comparar la cadena con "Andres" (Unicode)
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));

        // Comparar la cadena con "Aaron" (Unicode)
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));

        // Obtener el carácter en la posición 0
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));

        // Obtener el carácter en la posición 1
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));

        // Obtener el último carácter de la cadena
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        // Obtener una subcadena a partir de la posición 1
        System.out.println("nombre.substring(1) = " + nombre.substring(1));

        // Obtener una subcadena desde la posición 1 hasta la 3
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));

        // Obtener una subcadena desde la antepenúltima posición hasta el final
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        // Definir una cadena de trabalenguas
        String trabalenguas = "trabalenguas";

        // Reemplazar todas las apariciones de 'a' por '.'
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));

        // La cadena original no cambia
        System.out.println("trabalenguas = " + trabalenguas);

        // Encontrar la primera aparición de 'a' en la cadena
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));

        // Encontrar la última aparición de 'a' en la cadena
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));

        // Encontrar la posición de la subcadena "lenguas" en la cadena
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));

        // Verificar si la cadena contiene la subcadena "lenguas"
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));

        // Verificar si la cadena comienza con "tr"
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));

        // Verificar si la cadena termina con "s"
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));

        // Imprimir una cadena con espacios en blanco al inicio y al final
        System.out.println("  trabalenguas ");

        // Eliminar los espacios en blanco al inicio y al final de la cadena
        System.out.println("  trabalenguas ".trim());

    }
}
