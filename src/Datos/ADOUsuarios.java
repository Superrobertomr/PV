/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author My Little Kid
 */
public class ADOUsuarios {

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the TipoUsuario
     */
    public String getTipoUsuario() {
        return TipoUsuario;
    }

    /**
     * @param TipoUsuario the TipoUsuario to set
     */
    public void setTipoUsuario(String TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    /**
     * @return the Contrasena
     */
    public String getContrasena() {
        return Contrasena;
    }

    /**
     * @param Contrasena the Contrasena to set
     */
    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    //Atributos de un USUARIO
    Conexion conector = new Conexion();
    private Statement stm = null;
    private ResultSet rs = null;
    private Connection reg = null;
    
    private int idUsuario;
    private String Nombre;
    private String Apellidos;
    private String TipoUsuario;
    private String Contrasena;
    private String usuario;
    
    //CONSTRUCTOR para definir a los usuarios
    public ADOUsuarios(String nombre, String apellidos, String tipoUsuario,String contrasena, String usuario){
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.TipoUsuario = tipoUsuario;
        this.Contrasena = contrasena;
        this.usuario= usuario;
    }
    
    public ADOUsuarios(){
        
    }
    
    public int AgregarUsuario(ADOUsuarios users){
        int renglon = 0;
        String sql = "Insert into usuarios (Nombres, Apellidos, TipoUsuario, Contrasena) values('"+users.getNombre()+"', '"+users.getApellidos()+"', '"+users.getTipoUsuario()+"', '"+users.getContrasena()+"')";
        
        try {
            reg = conector.getConexion();
            if(reg!= null){
                stm = reg.createStatement();
                stm.executeUpdate(sql);
                renglon = 1;
            }
        } catch (SQLException ex) {
        }
        conector.Desconectar();
        return renglon;
    }
    
    public ResultSet TablaUsuarios(){
        ResultSet datos = null;
        String sql = "Select *from usuarios";
        try {
            reg = conector.getConexion();
            stm = reg.createStatement();
            datos = stm.executeQuery(sql);
        } catch (SQLException e) {
        }
        
        conector.Desconectar();
        return datos;
    }
    
    public int BajaUsuarios(int idUsuarios){
        int renglon = 0;
        String sql = "Delet from usuarios where idUsuario = '"+idUsuarios+"'Order by idUsuario Limit 1 ";
        try {
            reg = conector.getConexion();
            if(reg!= null){
                stm = reg.createStatement();
                stm.executeUpdate(sql);
                renglon = 1;
            }
        } catch (SQLException ex) {
        }
        conector.Desconectar();
        return renglon;
    }
    
}
