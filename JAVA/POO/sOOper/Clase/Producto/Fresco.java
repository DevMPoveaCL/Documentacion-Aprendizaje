package POO.sOOper.Clase.Producto;

import java.time.LocalDate;

import POO.sOOper.Interfaz.ICaducable;

public class Fresco extends Alimentacion implements ICaducable {

    private LocalDate caducidad;

    public Fresco(String referencia, int peso, int volumen, LocalDate caducidad) {
        super(referencia, peso, volumen);
        this.caducidad = caducidad;
    }

    @Override
    public boolean estaCaducado() {
        return caducidad.isBefore(LocalDate.now());
    }

}
