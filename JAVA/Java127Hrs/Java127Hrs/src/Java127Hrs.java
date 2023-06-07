//Version 1.0 ->  @author DevMPoveaCL = Primer programa, conociendo Java en Intellij

public class Java127Hrs {
    public static void main(String[] args) {
        // Definición de una variable de tipo String
        String saludar = "Curso de Java completo(+127hrs), vamos a darle con todo!";
        // Imprimir el valor de la variable "saludar" en mayúsculas
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        // Definición de variables numéricas
        int numero = 21;
        boolean valor = true;
        int numero2 = 5;

        // Verificar si la variable "valor" es verdadera
        if(valor) {
            // Imprimir el valor de la variable "numero"
            System.out.println("numero = " + numero);
            // Asignar un nuevo valor a la variable "numero2"
            numero2 = 10;
        }
        // Imprimir el valor de la variable "numero2"
        System.out.println("numero2 = " + numero2);

        // Definición de una variable de tipo String utilizando la inferencia de tipos ("var")
        var numero3 ="15";

        // Definición de una variable de tipo String
        String nombre;
        // Asignar un valor a la variable "nombre"
        nombre  = "Andrés";

        // Verificar si la variable "numero" es mayor que 10
        if (numero > 10) {
            // Asignar un nuevo valor a la variable "nombre"
            nombre = "Juan";
        }

        // Imprimir el valor de la variable "nombre"
        System.out.println("nombre = " + nombre);
    }
}