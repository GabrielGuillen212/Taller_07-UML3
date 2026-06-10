
import java.util.ArrayList;

abstract class USUARIO {
    protected String usuario;
    protected String contraseña;
    protected String nombre;
    protected String apellido;

    //ASOCIACION UN USUARIO ES RESPONSABLE DE 0 A MUCHOS
    public static ArrayList<INCIDENTE> listincidentes= new ArrayList();


    public USUARIO(String usuario,String contraseña,String nombre,String apellido){
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.nombre=nombre;
        this.apellido=apellido;

    }
// metodo login()boolean y metodo logout boolean
    protected boolean login(){
        //LOGICA DE METODO
    }
    protected boolean logOUT(){
        //LOGICA DE METODO
    }






}