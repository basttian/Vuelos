/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Modelo;

import vuelo.Control.Paises;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class PaisesData {
    
    private Connection connection = null;
    public PaisesData(Conexion conexion){
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
            ex.printStackTrace();
        }
     }  
    
    ///INSERTAR DATOS TABLA PAISES  
    
    public void guardarPaises(Paises paises){

        try {
        String sql = "INSERT INTO tbl_pais (cod_pais, pais) VALUES (?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        stmt.setInt(1,paises.getCod_pais());
        stmt.setString(2, paises.getPais());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if(rs.next()){
        paises.setCod_pais(rs.getInt(1));
        System.out.println("Pais: " + paises.getPais());
        }else{
            System.out.println("No se pudo obtener el ID del Pais");    
             }
        } catch (SQLException ex) {
            Logger.getLogger(PaisesData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al insertar un Pais");
        }   
    }
      
}
