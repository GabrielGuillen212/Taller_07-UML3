public class SOPORTECNICO extends USUARIO {
    //asociacioon lo conoce a USUARIO y ADMINISTRADOR
    private USUARIO usuario; 
    private ADMINNISTRADOR administrador; 

    public SOPORTECNICO(String usuario,String contraseña,String nombre,String apellido){
       super(usuario,contraseña,nombre,apellido);
    }


    //metodos 
    public static void brindarAsistencia(USUARIO usuario){

        //logica de metodo
    }

    public static void resolverProblemaTecnico(USUARIO usuario){

        //logica de metodo
    }

    public static void derivarProblemaDeGestion(ADMINISTRADOR administrador){

        //logica de metodo
    }
//IMPORTANTE ASOCIACIO CON user Y admin 
  

}




CLASSSE equipo 
 1jugador le puede pertenecer  amuchos equipos y un equipo tiene muchos jugadores 
arraylist jugadoes 

CLASS JUGADOR
EQUIPO  EQUIPO; 




CLASS USUARIO 
array list incidentes 

CLASE INCIDENTE 
USUARIO 