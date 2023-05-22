package S107Anotaciones.S107N1Ex1;

public class Main {

    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Juan", "Perez", 10.0);
        double sueldoTrabajador = trabajador.calcularSueldo(40);
        System.out.println("Sueldo del Trabajador: " + sueldoTrabajador);

        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("María", "González", 12.0);
        double sueldoTrabajadorOnline = trabajadorOnline.calcularSueldo(50);
        System.out.println("Sueldo del Trabajador Online: " + sueldoTrabajadorOnline);

        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Pedro", "López", 15.0);
        double sueldoTrabajadorPresencial = trabajadorPresencial.calcularSueldo(45);
        System.out.println("Sueldo del Trabajador Presencial: " + sueldoTrabajadorPresencial);
    }
}
