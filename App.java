public class App {
    public static void main(String[] args) throws Exception {

     Empleados[] emp = new Empleados[3];
     emp[0] = new trabajadorestiempocompleto("Deckard Shaw", "7777", 48000);
     emp[1] = new trabajadoremediotiempo("Roman Reings", "1264", 100 , 8);

     for (Empleados chamba: emp){
        System.out.println("trabajador: " + chamba.getNombre() + "salariomensual: $" + chamba.calcularsalario());
     }

    }
}
