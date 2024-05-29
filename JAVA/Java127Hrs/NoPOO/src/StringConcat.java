//Version 1.0 ->  @author DevMPoveaCL = Ejemplo de concatenación de String con operador "+" & ".concat"
public class StringConcat {
    public static void main(String[] args) {

        // Definir el nombre del curso y el nombre del profesor
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        // Crear una cadena que contiene los detalles del curso y el profesor
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        // Realizar una operación de suma entre dos números y agregarlo al detalle
        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + " " + (numeroA + numeroB));

        // Sumar dos números y luego agregar el resultado al detalle
        System.out.println(numeroA + numeroB + " " + detalle);


        //si son pocos elementos ".concat" es más eficiente que el signo "+", ya que no crea instancias builder por detrás
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);

        //Aunque si utilizamos directamente el StringBuilder para concatenar...
        String a = "a";
        String b = "b";
        String c = a;

        //StringBuilder sería el más eficiente sin importar la cantidad de elementos a concatenar.
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        //tiempo determinado por cantidad de iteraciones, eficiencia de los 3 métodos demostrada por el for
        for (int i = 0; i < 100000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 4ms, 10000 => 105ms, 100000 => 5071ms
            // c += a + b + "\n"; //500 => 19ms, 1000 => 21ms, 10000 => 68ms, 100000 =>1976ms
            sb.append(a).append(b).append("\n"); //500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 8ms
        }

        long fin =System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("\nc = " + c);
        System.out.println("sb = " + sb.toString());

    }
}
