/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Modelo;

import vuelo.Control.Clientes;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class ClienteData {
    private Connection connection = null;
    public ClienteData(Conexion conexion){
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
            ex.printStackTrace();
        }
    }
    ////INSERTAR DATOS
    public void guardarCliente (Clientes cliente){
        try {
            String sql = "INSERT INTO cliente (nombre, n_pasaporte, n_tarjeta) VALUES (?, ?, ? )";
            PreparedStatement statement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getPasaporte());
            statement.setString(3, cliente.getTarjeta());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
            cliente.setIdCliente(rs.getInt(1));
            System.out.println("Apellido, Nombre: " + cliente.getNombre() );
        }else{
            System.out.println("No se pudo obtener el ID del Cliente");    
                }
        } catch (SQLException ex) {
            System.out.println("Error al insertar un Cliente");
        }
    }
    ////BUSCAR DATOS
    public void obtenerCliente (Clientes cliente){
        try {   
            String sql = "SELECT * FROM cliente  WHERE n_pasaporte = ? "; 
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getPasaporte()); // Busco por pasaporte desde vista
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){ 
            cliente.setIdCliente(resultSet.getInt(1));//Cada numero representa una columna 
            cliente.setNombre(resultSet.getString(2));
            cliente.setPasaporte(resultSet.getString(3));
            cliente.setTarjeta(resultSet.getString(4));
            } 
        }catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al obtener los Clientes: " + ex.getMessage());
        }
    }
    ////MODIFICAR DATOS
   public void modificarCliente(Clientes cliente){
        try {
            String sql = "UPDATE cliente SET nombre = ?, n_pasaporte = ?, n_tarjeta = ? WHERE id_cliente = ?  "; // actualizo el identificador de tabla
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getPasaporte());
            statement.setString(3, cliente.getTarjeta()); 
            statement.setInt(4, cliente.getIdCliente());  //locallizo el id que le paso desde la vista F_Clientes y lo modifico
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al modificar el Clientes: " + ex.getMessage());
        }
   }    
    ///ELIMINAR DATOS
   public void eliminarCliente(Clientes cliente){
           try {
            String sql = "DELETE FROM cliente  WHERE id_cliente = ? ";
            PreparedStatement statement = connection.prepareStatement(sql); 
            statement.setInt(1, cliente.getIdCliente());  //localizo el id que le paso desde la vista F_Clientes y lo elimino
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al eliminar el Cliente: " + ex.getMessage());
        }
     }      
}
