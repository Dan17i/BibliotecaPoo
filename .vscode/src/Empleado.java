public class Empleado extends persona{
    
    private String cargo;

    //--------------------------------------------------------------------------------------------------------------------------------------------

    

    //--------------------------------------------------------------------------------------------------------------------------------------------
     
    public String getCargo(){

        return cargo;
    }
    public Empleado(String nombre, String id, String celular, String correo, String direccion, String cargo) {
        super(nombre, id, celular, correo, direccion);
        this.cargo = cargo;
    }
    public void setCargo (String nuevoCargo){
        this.cargo=nuevoCargo;
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------
    
    public String actualizarEmpleado (Empleado empleado){
        return null;
    }

}
