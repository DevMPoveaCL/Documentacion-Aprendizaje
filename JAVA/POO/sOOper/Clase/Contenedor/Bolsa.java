package POO.sOOper.Clase.Contenedor;

import POO.sOOper.Enum.TipoContenedor;

public class Bolsa extends Contenedor {

    // Define un campo específico de "Bolsa" para almacenar el ancho de la bolsa.
    private int ancho;

    // Constructor de la clase "Bolsa" que llama al constructor de la clase
    // "Contenedor" y establece el ancho de la bolsa.
    public Bolsa(String referencia, int alto, int ancho, int resistencia) {
        super(referencia, alto, resistencia);
        this.ancho = ancho;
    }

    // Override del método "getTipo()" de la clase base "Contenedor" para devolver
    // el tipo de contenedor "Bolsa".
    @Override
    public TipoContenedor getTipo() {
        return TipoContenedor.BOLSA;
    }

    // Calcula y devuelve la superficie de la bolsa en función del diámetro.
    @Override
    public int getSuperficie() {
        int radio = getDiametro() / 2;
        return (int) (Math.PI * radio * radio);
    }

    // Calcula y devuelve el diámetro de la bolsa a partir del ancho.
    private int getDiametro() {
        return (int) ((2 * ancho) / Math.PI);
    }

}
