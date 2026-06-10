public class ADMINISTRADOR extends USUARIO {
    //asociacioon los conoce a los dos 
    
    private CURSO curso;
    private PROFESOR responsable;
   
    public ADMINISTRADOR(String usuario,String contraseña,String nombre,String apellido){
       super(usuario,contraseña,nombre,apellido);
    }


    //metodos 
    public static void crearUsuarioConRol(String usuario,String contraseña){

        //logica de metodo
    }

    public static void asignarPermiso(String usuario){

        //logica de metodo
    }

    public static void actualizarSoftware(){

        //logica de metodo
    }
//IMPORTANTE ASOCIACIO CON CURSO Y PROFESOR  
    public static void asignarResponsable(CURSO curso,PROFESOR responsable){

        //logica de metodo
    }

}