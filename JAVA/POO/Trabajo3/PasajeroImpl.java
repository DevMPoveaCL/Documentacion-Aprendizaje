// Clase que implementa la interface Pasajero
public class PasajeroImpl implements IPasajero {
    private String nombre;
    private String destino;
    private int valorPasaje;

    public PasajeroImpl(String nombre, String destino, int valorPasaje) {
        this.nombre = nombre;
        this.destino = destino;
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public int getValorPasaje() {
        return valorPasaje;
    }
}
