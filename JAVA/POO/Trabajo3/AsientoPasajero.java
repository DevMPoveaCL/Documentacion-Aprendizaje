// Clase que extiende Asiento y representa un asiento ocupado por un pasajero
public class AsientoPasajero extends Asiento {
    public AsientoPasajero(int numeroAsiento) {
        super(numeroAsiento);
    }

    @Override
    public String toString() {
        if (estaOcupado()) {
            return "Asiento " + numeroAsiento + ": Ocupado por " + pasajero.getNombre();
        } else {
            return "Asiento " + numeroAsiento + ": Desocupado";
        }
    }
}
