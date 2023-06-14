//Version 1.0 ->  @author DevMPoveaCL = Tipos de variables primitivas.
public class Primitivos {
    public static void main(String[] args) {

        //Tipo byte: 127(máx) y -128(min)
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES); //1
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE); //8
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);

        //Tipo short: 32767(máx) y -32768(min)
        short numeroShort = 32767;
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES); //2
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE); //16
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        //Tipo int: 2147483647(máx) y -2147483648(min).
        int numeroInt = 2147483647;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES); //4
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE); //32
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        // Tipo long: 9223372036854775807(máx) y -9223372036854775808(min)
        long numeroLong = 9223372036854775807L; //Buena práctica = mayus en lugar de minus para no confundir con un 1
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES); //8
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE); //64
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        //Tipo float, pueden escribirse con exponenciales o no, también con negativos
        float realFloat = 2.21e3f; //2120f
        System.out.println("\nrealFloat = " + realFloat);

        //Tipo float con exponente negativo, puede escribirse de cualquiera de las 2 formas
        float expNegativo = 0.00000000015f; //1.5e-10f
        System.out.println("expNegativo = " + expNegativo);

        System.out.println("Tipo float corresponde en byte a: " + Float.BYTES); //4
        System.out.println("Tipo float corresponde en bites a: " + Float.SIZE); //32
        System.out.println("Valor máximo de un float: " + Float.MAX_VALUE); //3.4028235E38
        System.out.println("Valor mínimo de un float: " + Float.MIN_VALUE); //1.4E-45

        //Misma lógica que el tipo float en cuanto a los exponentes y letras (sufijo "D" opcional)
        double realDouble = 3.14;
        System.out.println("\nrealDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a: " + Double.BYTES); //8
        System.out.println("Tipo double corresponde en bites a: " + Double.SIZE); //64
        System.out.println("Valor máximo de un double: " + Double.MAX_VALUE); //1.7976931348623157E308
        System.out.println("Valor mínimo de un double: " + Double.MIN_VALUE); //4.9E-324

        // var por defecto es int
        var intVar = 125;
        System.out.println("\nintVar = " + intVar);

        //se modifica dependiendo del dato ingresado ya sea con un punto "decimal" o el sufijo de la letra reservada
        // var tipo float, "F" final
        var floatVar = 9223372036854775808F;
        System.out.println("floatVar = " + floatVar);

        //var tipo double, basta con poner un "punto" que indique es decimal
        var doubleVar = 3.14;
        System.out.println("doubleVar = " + doubleVar);
        // o caso contrario, agregar el sufijo "D" al número decimal
        var doubleVarDos = 3.14D;
        System.out.println("doubleVarDos = " + doubleVarDos);

        //Tipo long, se agrega una L al final como sufijo del número
        var longVar = 345L;
        System.out.println("longVar = " + longVar);

        //Tipo char, estándar unicode: permite nums del 1 al 9 o una letra / caracter especial
        char caracter = '%';
        System.out.println("\ncaracter = " + caracter); //%

        /*Truco: en windows presiona la tecla windows y escribe "mapa de caracteres"
        se mostrarán todos los caracteres del estándar junto con su código para copiar y pegar en nuestro cod java*/
        char musicUnicode = '\u266B';
        char musicDecimal = 9835;
        System.out.println("musicUnicode = " + musicUnicode); //♫
        System.out.println("musicDecimal = " + musicDecimal); //♫
        System.out.println("musicUnicode = musicDecimal?: " + (musicUnicode == musicDecimal)); //true, comprueba igualdad
        //backslash interesantes
        // "\b" = retroceso, equivalente a un backspace o borrar un espacio
        // "\t" = tabulador, equivalente a realizar una tabulacion con tab
        // "\n" = nuevaLinea, salto de linea o enter

        // Tipo boolean: true o false
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        
        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        datoLogico = d > f; //false
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1); //true
        System.out.println("esIgual = " + esIgual);

    }
}
