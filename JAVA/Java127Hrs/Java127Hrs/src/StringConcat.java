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


        //.concat es más eficiente que el signo "+", ya que no crea instancias builder por detrás
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }
}
