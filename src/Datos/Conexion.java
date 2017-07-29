/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;   //Traduce un String a un codigo SQL para las BUSQUEDAS
/**
 *
 * @author My Little Kid
 */
public class Conexion {

    public Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    private String usuario;
    private String contrasena;
    Connection con = null;
    //String URL = "jdbc:mysql://localhost:3306/pv1","root","";  //3306 El Intranet del Workbench
    
    //conexion a base de datos DIRECTA
    public Conexion(String Usuario, String Contrasena) throws SQLException, ClassNotFoundException{
        this.usuario = Usuario;
        this.contrasena = Contrasena;
        try{
           Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pv1","root","");
        }catch(ClassNotFoundException | SQLException e){
        
        }
        return con;
        }
    
        }
