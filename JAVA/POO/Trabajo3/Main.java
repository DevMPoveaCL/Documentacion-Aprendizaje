
//librerias - Clases de JAVA
import java.io.File; //Clase que llama a los archivos o ficheros de un directorio
import java.io.IOException; //Clase que llama las excepciones ocupadas
import java.util.Scanner; //Clase para leer texto ingresado

public class Main {
    public static void main(String[] args) {
        Bus bus = cargarDatosBus(); // Cargar los datos del bus
        cargarAsientosOcupados(bus); // Cargar los asientos ocupados
        mostrarMenu(bus); // Mostrar el menú principal
        bus.guardarDatosActualizados(); // Guardar los datos actualizados
    }

    // Carga los datos del bus y devuelve una instancia de la clase "Bus"
    private static Bus cargarDatosBus() {
        String patente = null;
        String nombreConductor = null;
        try {
            File archivoBus = new File("C:\\Trabajo3\\datosBus.txt");
            Scanner scanner = new Scanner(archivoBus);
            String datosBus = scanner.nextLine();
            String[] partes = datosBus.split(";");
            patente = partes[0];
            nombreConductor = partes[1];
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al cargar los datos del bus.");
            System.exit(1);
        }
        return new Bus(patente, nombreConductor, 20);
    }

    // Carga los asientos ocupados y los asigna al bus
    private static void cargarAsientosOcupados(Bus bus) {
        try {
            File archivoAsientos = new File("C:\\Trabajo3\\primeraSubidaBus.txt");
            Scanner scanner = new Scanner(archivoAsientos);
            while (scanner.hasNextLine()) {
                String datosAsiento = scanner.nextLine();
                String[] partes = datosAsiento.split(";");
                int numeroAsiento = Integer.parseInt(partes[0]);
                String nombrePasajero = partes[1];
                String destino = partes[2];
                int valorPasaje = Integer.parseInt(partes[3]);

                IPasajero pasajero = new PasajeroImpl(nombrePasajero, destino, valorPasaje);
                bus.subirPasajero(numeroAsiento, pasajero);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al cargar los asientos ocupados.");
            System.exit(1);
        }
    }

    // Muestra el menú principal y procesa las opciones seleccionadas por el usuario
    private static void mostrarMenu(Bus bus) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Subir un pasajero");
            System.out.println("2. Bajar un pasajero");
            System.out.println("3. Listar asientos ocupados");
            System.out.println("4. Listar asientos desocupados");
            System.out.println("5. Listar pasajeros con destino dado");
            System.out.println("6. Mostrar datos del bus");
            System.out.println("7. Filtrar pasajeros por valor mínimo del pasaje");
            System.out.println("8. Modificar nombre del conductor");
            System.out.println("9. Salir");
            System.out.print("Ingresa una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            // Ejecuta las opciones ingresadas por el usuario
            switch (opcion) {
                case 1:
                    System.out.print("Número de asiento: ");
                    int numeroAsientoSubir = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre del pasajero: ");
                    String nombrePasajero = scanner.nextLine();
                    System.out.print("Destino: ");
                    String destinoPasajero = scanner.nextLine();
                    System.out.print("Valor del pasaje: ");
                    int valorPasaje = scanner.nextInt();
                    scanner.nextLine();
                    IPasajero pasajeroSubir = new PasajeroImpl(nombrePasajero, destinoPasajero, valorPasaje);
                    bus.subirPasajero(numeroAsientoSubir, pasajeroSubir);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Número de asiento: ");
                    int numeroAsientoBajar = scanner.nextInt();
                    scanner.nextLine();
                    bus.bajarPasajero(numeroAsientoBajar);
                    System.out.println();
                    break;
                case 3:
                    bus.listarAsientosOcupados();
                    System.out.println();
                    break;
                case 4:
                    bus.listarAsientosDesocupados();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Ingresa el destino: ");
                    String destinoListar = scanner.nextLine();
                    bus.listarPasajerosDestino(destinoListar);
                    System.out.println();
                    break;
                case 6:
                    bus.mostrarDatosBus();
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Ingresa el valor mínimo del pasaje: ");
                    int valorMinimo = scanner.nextInt();
                    scanner.nextLine();
                    bus.filtrarPasajerosPorValorMinimo(valorMinimo);
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Ingresa el nuevo nombre del conductor: ");
                    String nuevoNombreConductor = scanner.nextLine();
                    bus.modificarNombreConductor(nuevoNombreConductor);
                    System.out.println("Nombre del conductor modificado correctamente.");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    System.out.println();
                    break;
            }
        } while (opcion != 9);

        scanner.close();
    }
}
