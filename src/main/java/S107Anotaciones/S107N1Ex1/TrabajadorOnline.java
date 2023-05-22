package S107Anotaciones.S107N1Ex1;

public class TrabajadorOnline extends Trabajador {
    private static final double TARIFA_INTERNET = 50.0;

    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        double sueldoBase = super.calcularSueldo(horasTrabajadas);
        return sueldoBase + TARIFA_INTERNET;
    }
}
