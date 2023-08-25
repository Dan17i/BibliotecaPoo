public class persona {

    private String nombre ;
    private String  id ;
    private String celular;
    private String correo;
    private String direccion;
    //-------------------------------------------------------------------------------------------

    public persona(String nombre, String id, String celular, String correo, String direccion){
        this.nombre=nombre;
        this.id=id;
        this.celular=celular;
        this.correo=correo;
        this.direccion=direccion;
    }

    public String getNombre (){
        return nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre=nuevoNombre;
    }

    public String getId (){
        return id;
    }
    public void setId(String nuevoId){
        this.id=nuevoId;
    }
    public String getCelular (){
        return celular;
    }
    public void setCelular(String nuevoCelular){
        this.celular=nuevoCelular;
    }
    public String getCorreo (){
        return correo;
    }
    public void setCorreo(String nuevoCorreo){
        this.correo=nuevoCorreo;
    }
    public String getDireccion (){
        return direccion;
    }
    public void setDireccion(String nuevoDireccion){
        this.direccion=nuevoDireccion;
    }
//-----------------------------------------------------------------------------------------------
   public String buscarpersona(String id){
    return null;
   }
   public void eliminarrPersona(String id){

   }

}
