import java.util.ArrayList;

abstract class PERSONALACADEMICO extends USUARIO {
    //asociacioon los conoce a los dos
    public static ArrayList<INCIDENTE> listincidentes= new ArrayList();
    private FORO foro;
    public PERSONALACADEMICO(String usuario, String contraseña, String nombre, String apellido){
       super(usuario,contraseña,nombre,apellido);
    }


    //metodos 
    public static void reportarError(String email,String contenido){

        //logica de metodo
    }

    public static void solicitarAsesoramientoDelSistema(String email,String contenido){

        //logica de metodo
    }

    public static void comentarEnForo(FORO foro, String Comentario){

        //logica de metodo
    }


}