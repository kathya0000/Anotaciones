package S107Anotaciones.S107N1Ex2;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        TrabajadorOnline trabajadorOnline = new TrabajadorOnline("María", "González", 12.0);

        double sueldoObsoleto = trabajadorOnline.calcularSueldo(50);
        System.out.println("Sueldo obsoleto del Trabajador Online: " + sueldoObsoleto);

        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial("Pedro", "López", 15.0);
        trabajadorPresencial.metodoObsoleto();
    }
}