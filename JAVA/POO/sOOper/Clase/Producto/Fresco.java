package POO.sOOper.Clase.Producto;

import java.time.LocalDate;

import POO.sOOper.Interfaz.ICaducable;

public class Fresco extends Alimentacion implements ICaducable {

    private LocalDate caducidad; // fecha de caducidad del producto

    // constructor de la clase Fresco, recibe la referencia del producto, su peso y
    // volumen, y su fecha de caducidad
    public Fresco(String referencia, int peso, int volumen, LocalDate caducidad) {
        super(referencia, peso, volumen); // se llama al constructor de la superclase Alimentacion
        this.caducidad = caducidad; // se asigna la fecha de caducidad al atributo de la clase
    }

    // método que verifica si el producto está caducado o no, devuelve true si ya
    // caducó y false si no
    @Override
    public boolean estaCaducado() {
        return caducidad.isBefore(LocalDate.now()); // se compara la fecha de caducidad con la fecha actual
    }

}
