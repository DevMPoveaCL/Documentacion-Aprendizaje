package POO.sOOper.Clase.Contenedor;

import POO.sOOper.Enum.TipoContenedor;
import POO.sOOper.Interfaz.IProducto;

//Clase caja hereda todas las características de Contenedor y las extiende.
public class Caja extends Contenedor {

    private int ancho;
    private int largo;

    // this."atributo" para los atributos de la clase e ""=" para los argumentos
    // recibidos.
    public Caja(String referencia, int alto, int ancho, int largo) {
        super(referencia, alto, 0);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public int getSuperficie() {
        return ancho * largo;
    }

    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.CAJA;
    }

    @Override
    public boolean resiste(IProducto producto) {
        return true;
    }

}
