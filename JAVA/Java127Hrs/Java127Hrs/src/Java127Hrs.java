public class Java127Hrs {
    public static void main(String[] args) {
        String saludar = "Curso de Java completo(+127hrs), vamos a darle con todo!";
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 21;
        boolean valor = true;
        int numero2 = 5;

        if(valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 ="15";

        String nombre;
        nombre  = "Andrés";

        if (numero > 10) {
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);
    }
}