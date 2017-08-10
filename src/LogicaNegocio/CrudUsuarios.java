/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;
import Datos.ADOUsuarios;
import java.sql.ResultSet;

/**
 *
 * @author My Little Kid
 */
public class CrudUsuarios {
    
    ADOUsuarios Usuario = new ADOUsuarios();
    
    public int AltasUsuarios(String Nombre, String Apellidos, String TipoUsuario,String Contrasena){
        int bandera = 0;
        Usuario.setNombre(Nombre);
        Usuario.setApellidos(Apellidos);
        Usuario.setTipoUsuario(TipoUsuario);
        Usuario.setContrasena(Contrasena);
        
        bandera = Usuario.AgregarUsuario(Usuario);
        return bandera;
    }
    
    public ResultSet TabladeUsuarios(){
        ResultSet tabla = null;
        tabla = Usuario.TablaUsuarios();
        return tabla;
    }
    
}
