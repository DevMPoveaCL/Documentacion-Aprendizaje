//Version 1.0 ->  @author DevMPoveaCL = Tipos de variables primitivas.
public class Primitivos {
    public static void main(String[] args) {

        //Tipo short: 127(máx) y -128(min)
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " + Byte.MIN_VALUE);

        //Tipo short: 32767(máx) y -32768(min)
        short numeroShort = 32767;
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " + Short.MIN_VALUE);

        //Tipo int: 2147483647(máx) y -2147483648(min)
        int numeroInt = 2147483647;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " + Integer.MIN_VALUE);

        // Tipo long: 9223372036854775807(máx) y -9223372036854775808(min)
        long numeroLong = 9223372036854775807L; //Buena práctica = mayus en lugar de minus para no confundir con un 1
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un long: " + Long.MIN_VALUE);

        // Utilización de inferencia de tipos ("var") para una variable de tipo float
        var numeroVar = 9223372036854775808f;
    }
}
