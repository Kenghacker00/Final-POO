public class trabajadorestiempocompleto extends Empleados {
    private double salarioanual;

    public trabajadorestiempocompleto(String Nombre, String numeroidentificación, double salarioanual) {
        super(Nombre, numeroidentificación);
        this.salarioanual = salarioanual;
    }

    @Override
    public double calcularsalario() {
       return salarioanual / 12; //salario mensual.
    }



}
