/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sebastian
 */
public class Conexion {
   private String url;
   private String usuario;
   private String password;

    private Connection conexion;
    
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;

        
        Class.forName("com.mysql.jdbc.Driver");

    }
    
    public Connection getConexion() throws SQLException{
        if(conexion == null){
                    // Setup the connection with the DB
            conexion = (Connection) DriverManager
                .getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"+ "&user=" + usuario + "&password=" + password);
        }
        return conexion;
    } 
}
