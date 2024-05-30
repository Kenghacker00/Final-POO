public class trabajadoremediotiempo extends Empleados {
    private double salarioPorhora;
    private int horasTrabajadasPorSemana;

    public trabajadoremediotiempo(String Nombre, String numeroidentificación, double salarioPorhora, int horasTrabajadasPorSemana){
        super(Nombre, numeroidentificación);
        this.salarioPorhora = salarioPorhora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    @Override
    public double calcularsalario(){
        return salarioPorhora * horasTrabajadasPorSemana * 4; // salario mensual
    }

}
