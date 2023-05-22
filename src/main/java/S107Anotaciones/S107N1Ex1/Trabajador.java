package S107Anotaciones.S107N1Ex1;


public class Trabajador {
    private String nombre;
    private String apellido;
    private double precioHora;

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    public double calcularSueldo(double horasTrabajadas) {
        return precioHora * horasTrabajadas;
    }
}