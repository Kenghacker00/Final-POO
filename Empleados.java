abstract class Empleados {
    
    private String Nombre;
    private String nueroidentificación;

    public Empleados(String Nombre, String numeroidentificación){
        this.Nombre = Nombre;
        this.nueroidentificación = numeroidentificación;
    }
   public String getNombre(){
    return Nombre;
   }
  
   public String getnumeroidentificación(){
    return nueroidentificación;
   }

   public  abstract double calcularsalario();

}
