public class SistemasNumericos {
    public static void main(String[] args) {

        //Decimales (por defecto)
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        //Convierte la variable numeroDecimal a binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        //Binarios
        //Agrega "0b" como prefijo para indicar a java que es binario
        int numeroBinario = 0b111110100;
        //imprime por defecto en decimal
        System.out.println("numeroBinario = " + numeroBinario);
        //Convierte la variable numeroBinario a octal
        System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));


        //Octales
        //Agrega "0" como prefijo para indicar a java que es octal
        int numeroOctal = 0764;
        // ->Recuerda<- imprime por defecto en decimal
        System.out.println("numeroOctal = " + numeroOctal);
        //Convierte la variable numeroOctal a hexadecimal
        System.out.println("numero hexadecimal de " + numeroOctal + " = " + Integer.toHexString(numeroOctal));
    
        //Hexadecimales
        //Agrega "0x" como prefijo para indicar a java que es hexadecimal
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    
    }
}
