//Version 1.0 ->  @author DevMPoveaCL = Métodos String útiles para convertir hacia array.

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

            // Definir una cadena de trabalenguas
            String trabalenguas = "trabalenguas";

            // Obtener la longitud de la cadena
            System.out.println("trabalenguas.length() = " + trabalenguas.length());

            // Convertir la cadena en un arreglo de caracteres
            System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

            // Convertir la cadena en un arreglo de caracteres y obtener su longitud
            char[] arreglo = trabalenguas.toCharArray();
            int largo = arreglo.length;
            System.out.println("largo = " + largo);

            // Imprimir el arreglo de caracteres
            for (int i = 0; i < largo; i++) {
                System.out.print(arreglo[i]); //"print" imprime horizontal y "println" imprime vertical
            }
            System.out.println();

            // Dividir la cadena utilizando "a" como delimitador
            System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

            // Dividir la cadena y almacenar las partes en un arreglo
            String[] arreglo2 = trabalenguas.split("a");
            int l = arreglo2.length;

            // Imprimir las partes del arreglo
            for (int j = 0; j < l; j++) {
                System.out.println(arreglo2[j]);
            }

            // Dividir una cadena de archivo basándonos en el punto y obtener la extensión
            String archivo = "alguna.imagen.jsf";
            String[] archivoArr = archivo.split("\\."); // Se debe usar "\\." para escapar el punto literal ó "[]"
            l = archivoArr.length;
            System.out.println("l = " + l);

            // Imprimir las partes del arreglo
            for (int j = 0; j < l; j++) {
                System.out.println(archivoArr[j]);
            }

            // Imprimir la extensión del archivo
            System.out.println("extension = " + archivoArr[l-1]);
        }
}
