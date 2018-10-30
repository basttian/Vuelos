/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import vuelo.Control.Asientos;

/**
 *
 * @author Sebastian
 */
public class AsientoData {

    private Connection connection = null;

    public AsientoData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
            ex.printStackTrace();
        }
    }
    
    
    public void GuardarAsientos(Asientos asientos){
    
        try {
            String sql = "INSERT INTO asiento (id_vuelo, ubicacion, posicion, disponibilidad, precio_asiento) VALUES (?, ?, ?, ?, ? )";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, asientos.getIdvuelo());
            statement.setString(2, asientos.getUbicacion()); 
            statement.setString(3, asientos.getPosicion());
            statement.setBoolean(4, asientos.isDisponibilidad());
            statement.setFloat(5, asientos.getPrecio());
            statement.executeUpdate();
            statement.close();
    }   catch (SQLException ex) {
            Logger.getLogger(AsientoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void CargarTablaAsientos(JTable jTable, int val)throws SQLException{
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nº de Vuelo");
        model.addColumn("Ubicacion");
        model.addColumn("Posicion");
        model.addColumn("Disponibilidad");
        model.addColumn("Precio $");
        TableColumnModel col = jTable.getColumnModel();
        
         try { 
        String sql = "SELECT * FROM asiento WHERE id_vuelo = '" + val + "'";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();
            while (resultado.next()) {
                Object[] data = new Object[6];
                for (int row = 0; row < 6; row++) {
                    data[row] = resultado.getObject(row + 1);
                } 
                model.addRow(data);    
            }
            jTable.setModel(model);
            jTable.removeColumn(col.getColumn(0));//elimino la columna id
            jTable.removeColumn(col.getColumn(0));//elimino la columna Nº de vuelo
    }catch (SQLException ex) {
            Logger.getLogger(AsientoData.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
    public void LimpiarTabla(JTable jTable) {
       jTable.setModel(new DefaultTableModel());
     
       // DefaultTableModel model = new DefaultTableModel();
       // for(int i=0; i < jTable.getRowCount(); i++)
       // {
       // model.removeRow(i);
       // i-=1;
       // }
    }
    
    
    
}
