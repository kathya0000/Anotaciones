package S107Anotaciones.S107N1Ex2;

public class TrabajadorPresencial extends Trabajador {
    private static final double GASOLINA = 20.0;

    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    @Deprecated
    public double calcularSueldo(double horasTrabajadas) {
        double sueldoBase = super.calcularSueldo(horasTrabajadas);
        return sueldoBase + GASOLINA;
    }

    @Deprecated
    public void metodoObsoleto() {
        System.out.println("Este método está obsoleto.");
    }
}