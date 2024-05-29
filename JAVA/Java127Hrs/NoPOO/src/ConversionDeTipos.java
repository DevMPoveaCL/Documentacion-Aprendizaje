//Version 1.0 ->  @author DevMPoveaCL = Conversiones de datos, cadenas de textos y primitivos
public class ConversionDeTipos {
    public static void main(String[] args) {

        // Convertir una cadena que contiene un valor numérico a un entero
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // Convertir una cadena que contiene un número real en notación científica a un double
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        // Convertir una cadena que representa un valor booleano a un booleano
        String logicoStr = "TruE";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // Asignar un valor entero
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        // Convertir un entero a una cadena
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // Convertir la suma de un entero y una constante a una cadena
        otroNumeroStr = String.valueOf(otroNumeroInt + 10); //valueOf puede
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // Asignar un valor double
        double otroRealDouble = 1.23456e2;
        // Convertir un double a una cadena
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // Convertir un valor float literal a una cadena
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        // Asignar un valor entero
        int i = 22768;
        // Realizar una conversión explícita del entero a short
        short s = (short) i;
        System.out.println("s = " + s);

        // Realizar una conversión implícita del entero a long
        long l = i;
        System.out.println("l = " + l);

        // Imprimir el valor máximo de un short
        System.out.println(Short.MAX_VALUE);

        // Realizar una conversión explícita del entero a char (puede resultar en un carácter diferente)
        char b = (char) i;
        System.out.println("b = " + b);

        // Realizar una conversión explícita del entero a float
        float f = (float) i;
        System.out.println("f = " + f);
    }
}