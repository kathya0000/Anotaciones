package S107Anotaciones.S107N1Ex1;

public class TrabajadorPresencial extends Trabajador {
    private static final double GASOLINA = 20.0;

    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        double sueldoBase = super.calcularSueldo(horasTrabajadas);
        return sueldoBase + GASOLINA;
    }
}
