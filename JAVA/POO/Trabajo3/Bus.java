import java.io.FileWriter;
import java.io.IOException;

// Clase que representa un bus y sus funcionalidades
public class Bus {
    private String patente;
    private String nombreConductor;
    private Asiento[] asientos;

    public Bus(String patente, String nombreConductor, int numeroAsientos) {
        this.patente = patente;
        this.nombreConductor = nombreConductor;
        this.asientos = new Asiento[numeroAsientos];

        // Inicializar los asientos del bus
        for (int i = 0; i < numeroAsientos; i++) {
            asientos[i] = new AsientoPasajero(i + 1);
        }
    }

    public void subirPasajero(int numeroAsiento, IPasajero pasajero) {
        // Verifica si el número de asiento está dentro del rango válido.
        if (numeroAsiento >= 1 && numeroAsiento <= asientos.length) {
            // Obtiene el objeto de asiento correspondiente al número de asiento ingresado.
            Asiento asiento = asientos[numeroAsiento - 1];
            // Verifica si el asiento está desocupado.
            if (!asiento.estaOcupado()) {
                // Asigna el pasajero al asiento y lo marca como ocupado.
                asiento.pasajero = pasajero;
                System.out.println("Pasajero subido correctamente al asiento " + numeroAsiento + ".");
            } else {
                // Muestra un mensaje de error indicando que el asiento ya está ocupado.
                System.out.println("El asiento " + numeroAsiento + " ya está ocupado.");
            }
        } else {
            // Muestra un mensaje de error indicando que el número de asiento es inválido.
            System.out.println("Número de asiento inválido.");
        }
    }

    public void bajarPasajero(int numeroAsiento) {
        // Verifica si el número de asiento está dentro del rango válido.
        if (numeroAsiento >= 1 && numeroAsiento <= asientos.length) {
            // Obtiene el objeto de asiento correspondiente al número de asiento ingresado.
            Asiento asiento = asientos[numeroAsiento - 1];
            // Verifica si el asiento está ocupado.
            if (asiento.estaOcupado()) {
                // Marca el asiento como desocupado, eliminando el pasajero asignado.
                asiento.pasajero = null;
                System.out.println("Pasajero bajado correctamente del asiento " + numeroAsiento + ".");
            } else {
                // Muestra un mensaje de error indicando que el asiento no está ocupado.
                System.out.println("El asiento " + numeroAsiento + " no está ocupado.");
            }
        } else {
            // Muestra un mensaje de error indicando que el número de asiento es inválido.
            System.out.println("Número de asiento inválido.");
        }
    }

    public void listarAsientosOcupados() {
        System.out.println("Asientos ocupados:");
        // Recorre todos los asientos del bus.
        for (Asiento asiento : asientos) {
            // Verifica si el asiento está ocupado.
            if (asiento.estaOcupado()) {
                // Muestra información sobre el asiento ocupado.
                System.out.println(asiento.toString());
            }
        }
    }

    public void listarAsientosDesocupados() {
        System.out.println("Asientos desocupados:");
        // Recorre todos los asientos del bus.
        for (Asiento asiento : asientos) {
            // Verifica si el asiento está desocupado.
            if (!asiento.estaOcupado()) {
                // Muestra información sobre el asiento desocupado.
                System.out.println(asiento.toString());
            }
        }
    }

    public void listarPasajerosDestino(String destino) {
        System.out.println("Pasajeros con destino a " + destino + ":");
        // Recorre todos los asientos del bus.
        for (Asiento asiento : asientos) {
            // Verifica si el asiento está ocupado y tiene el destino especificado.
            if (asiento.estaOcupado() && asiento.pasajero.getDestino().equalsIgnoreCase(destino)) {
                // Muestra el nombre del pasajero con el destino especificado.
                System.out.println(asiento.pasajero.getNombre());
            }
        }
    }

    public void mostrarDatosBus() {
        System.out.println("Datos del bus:");
        System.out.println("Patente: " + patente);
        System.out.println("Nombre del conductor: " + nombreConductor);
        System.out.println();

        System.out.println("Estado de los asientos:");
        // Recorre todos los asientos del bus.
        for (Asiento asiento : asientos) {
            // Muestra información sobre el estado del asiento.
            System.out.println(asiento.toString());
        }
    }

    public void filtrarPasajerosPorValorMinimo(int valorMinimo) {
        System.out.println("Pasajeros con valor de pasaje igual o superior a " + valorMinimo + ":");
        // Recorre todos los asientos del bus.
        for (Asiento asiento : asientos) {
            // Verifica si el asiento está ocupado y tiene un valor de pasaje igual o
            // superior al mínimo especificado.
            if (asiento.estaOcupado() && asiento.pasajero.getValorPasaje() >= valorMinimo) {
                // Muestra el nombre del pasajero que cumple con el criterio.
                System.out.println(asiento.pasajero.getNombre());
            }
        }
    }

    public void modificarNombreConductor(String nuevoNombreConductor) {
        // Modifica el nombre del conductor del bus.
        this.nombreConductor = nuevoNombreConductor;
    }

    public void guardarDatosActualizados() {
        try {
            // Crea un FileWriter para guardar los datos actualizados del bus en un archivo.
            FileWriter archivoUltimaBajada = new FileWriter("C:\\Trabajo3\\ultimaBajadaBus.txt");
            // Recorre todos los asientos del bus.
            for (Asiento asiento : asientos) {
                // Verifica si el asiento está ocupado.
                if (asiento.estaOcupado()) {
                    // Escribe la información del asiento ocupado en el archivo.
                    archivoUltimaBajada.write(asiento.numeroAsiento + ";" +
                            asiento.pasajero.getNombre() + ";" +
                            asiento.pasajero.getDestino() + ";" +
                            asiento.pasajero.getValorPasaje() + "\n");
                }
            }
            // Cierra el FileWriter después de escribir los datos en el archivo.
            archivoUltimaBajada.close();
        } catch (IOException e) {
            // Muestra un mensaje de error en caso de que ocurra una excepción al guardar
            // los datos.
            System.out.println("Error al guardar los datos actualizados del bus.");
        }
    }
}
