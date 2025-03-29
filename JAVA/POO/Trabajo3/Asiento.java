// Clase abstracta Asiento que representa un asiento en el bus
public abstract class Asiento {
    protected int numeroAsiento;
    protected IPasajero pasajero;

    public Asiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
        this.pasajero = null;
    }

    public boolean estaOcupado() {
        return pasajero != null;
    }

    // Método abstracto para mostrar el estado del asiento
    public abstract String toString();
}