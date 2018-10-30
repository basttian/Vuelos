/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Modelo;


import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import vuelo.Control.Ciudades;
import vuelo.Control.Paises;


/**
 *
 * @author Sebastian
 */
public class CiudadesData {
    
    private Connection connection = null;
    public CiudadesData(Conexion conexion){
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
            ex.printStackTrace();
        }
    }
        
    ////////CREAMOS LA LISTA PARA CARGAR EL COMBOBOX DE PAISES
    
    public List <Paises> LlenarComboPais(){ 
      List <Paises> paisees = new ArrayList<Paises>();
        try {
            String sql = "SELECT * FROM tbl_pais";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Paises paises;
            while(rs.next()){
            paises = new Paises();
            paises.setCod_pais(rs.getInt(1));
            paises.setPais(rs.getString("pais"));//columna 2
            paisees.add(paises);
            }  
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CiudadesData.class.getName()).log(Level.SEVERE, null, ex);
        }
       return paisees;
    }

    
    ///INSERTAR CIUDADES
    
    public void guardarCiudades(Ciudades ciudades){

        try {
        String sql = "INSERT INTO tbl_ciudad (id_pais, ciudad) VALUES (?,?)";
        PreparedStatement statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, ciudades.getPais());
        statement.setString(2, ciudades.getCiudad());
        statement.executeUpdate();
        ResultSet rs = statement.getGeneratedKeys();
        if(rs.next()){
        ciudades.setId_ciudad(rs.getInt(1));
        System.out.println("Ciudad: " + ciudades.getCiudad());
        }else{
            System.out.println("No se pudo obtener el ID de la Ciudad");    
             }
        } catch (SQLException ex) {
            Logger.getLogger(CiudadesData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al insertar una Ciudad");
        }
    }

}

