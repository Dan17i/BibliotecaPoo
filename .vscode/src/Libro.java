

public class Libro {
    
   private String isbn;
   private String titulo;
   private String fechaPublicacion;
   private String autor;
   
    //--------------------------------------------------------------------------------------
   
    public Libro (String isbn, String titulo, String fechaPublicacion, String autor){
        this.isbn=isbn;
        this.titulo=titulo;
        this.fechaPublicacion=fechaPublicacion;
        this.autor=autor;
    }
     //---------------------------------------------------------------------------------------
     
     public String getIsbn (){
        return isbn;
     }

     public void setIsbn (String nuevoIsbn){
        this.isbn=nuevoIsbn;
     }

     public String getTitulo (){
        return titulo;
     }

     public void setTitulo (String nuevoTitulo){
        this.titulo=nuevoTitulo;
     }

     public String getFechaPublicacion(){
        return fechaPublicacion;
     }
     public void setFechaPublicacion (String nuevoFechaPublicacion){
        this.fechaPublicacion=nuevoFechaPublicacion;
     }
     public String getAutor (){
         return autor;  
     }
     public void setAutor (String nuevoAutor){
        this.autor=nuevoAutor;
     }
     //---------------------------------------------------------------------------------------

     public boolean eliminarLibro (Libro libro){
        return true;
     }
     public Libro buscarPorIsbn (String isbn){
         return null;
     }
     public Libro actualizarLibro(Libro libro){
        //TODO 
        return null;
     }
   }

