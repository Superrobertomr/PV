/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;
import Datos.ValidarUsuario;

/**
 *
 * @author My Little Kid
 */
public class Validacion {
    
    public Validacion(){
        
    }
    
    public String ValidarUsuario(String Usuario, String Contrasena){
        
        ValidarUsuario validar = new ValidarUsuario();
        String user="";
        int Bandera = validar.VerificarUsuario(Usuario, Contrasena);
        if (Bandera == 1){
            user = Usuario;
        }
        
        if(Bandera == 0){
            user = "Nada";
        }
        return user;
    }
    
}
