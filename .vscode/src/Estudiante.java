public class Estudiante extends persona {

    private String programa;

    //--------------------------------------------------------------------------------------------------------------------------------------------
    
    public Estudiante(String nombre, String id, String celular, String correo, String direccion, String){
        super (nombre, id, celular,correo, direccion);
        this.programa=programa;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------

    public String getprograma(){
        return programa;
    }
    public void setprograma (String nuevoPrograma){
        this.programa=nuevoPrograma;
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------
     public String actualizarEstudiante(Estudiante estudiante){
        return null;
     }
}
