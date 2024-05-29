/*
    Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo
    java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
    Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante,
    también se pueden apoyar de google que hay varios ejemplos.
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculoEdad {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar una fecha de nacimiento en formato yyyy-MM-dd
        System.out.println("Ingrese una fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        // Crear un objeto de formato de fecha para parsear la entrada del usuario
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        // Parsear la cadena ingresada en un objeto Date representando la fecha de nacimiento
        Date fechaNacimiento = df.parse(fechaStr);

        // Obtener la fecha actual
        Date actual = new Date();

        // Crear un formato de fecha numérico con el año, mes y día
        df = new SimpleDateFormat("yyyyMMdd");

        // Convertir ambas fechas, la de nacimiento y la actual, en enteros que representan el año, mes y día
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        // Restar ambas fechas y dividir por 10000 para obtener la edad en años
        int edad = (hasta - desde) / 10000;
        System.out.println("La edad es: " + edad);
    }
}