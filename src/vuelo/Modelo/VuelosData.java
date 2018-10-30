
package vuelo.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vuelo.Control.Ciudades;
import vuelo.Control.Vuelo;


public class VuelosData {
    
    private Connection connection = null;
    public VuelosData(Conexion conexion){
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
            ex.printStackTrace();
        }
    }
    ////INSERTAR DATOS
    public void guardarVuelo(Vuelo vuelo){        
 
    try {
            String sql = "INSERT INTO tbl_vuelo (aerolinea,aeronave,id_ciudad_destino,id_ciudad_origen,fecha_partida,fecha_llegada,hora_partida,hora_llegada,precio_vuelo,id_vuelo,estado_vuelo) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString (1, vuelo.getAerolinea() );
            ps.setString (2, vuelo.getAeronave() );
            ps.setString(3, vuelo.getCiudadDestino());
            ps.setString(4, vuelo.getCiudadOrigen());
            
            ps.setString(5, vuelo.getFechaPartida());
            ps.setString(6, vuelo.getFechaLlegada());
            
            ps.setString(7, vuelo.getHoraPartida());
            ps.setString(8, vuelo.getHoraLlegada());
            
            ps.setFloat(9, vuelo.getPrecioVuelo());
            ps.setString(10, vuelo.getNumeroVuelo());
            ps.setString(11, vuelo.getEstadoVuelo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
      
        if(rs.next()){
            vuelo.setIdvuelo(rs.getInt(1));
            System.out.println("Aerolinea: " + vuelo.getAerolinea());
        }else{
            System.out.println("No se pudo obtener el ID del Vuelo");    
                }
        } catch (SQLException ex) {
            System.out.println("Error al insertar un vuelo");
            ex.printStackTrace();
        }  
    }

    public List <Ciudades> LlenarComboCiudad(String val){ 
      List <Ciudades> ciuda = new ArrayList<Ciudades>();
        try {
            //"SELECT * FROM tbl_ciudad WHERE id_pais = '"+ val +"'  ";// "SELECT pais, ciudad FROM tbl_ciudad INNER JOIN tbl_pais ON id_pais = cod_pais WHERE pais = '"+ val +"' ";
            String sql = "SELECT pais, ciudad FROM tbl_ciudad INNER JOIN tbl_pais ON id_pais = cod_pais WHERE pais = '"+ val +"' ";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Ciudades ciudad;
            while(rs.next()){
            ciudad = new Ciudades();
            ciudad.setStrpais(rs.getString("pais"));
       //     ciudad.setPais(rs.getInt(2));
            ciudad.setCiudad(rs.getString("ciudad"));
            ciuda.add(ciudad);
            }  
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CiudadesData.class.getName()).log(Level.SEVERE, null, ex);
        }
       return ciuda;
    }

    
    public void buscarVuelo(Vuelo vuelo){
        try {
            String sql = "SELECT * FROM tbl_vuelo INNER JOIN asiento ON tbl_vuelo.id_vuelo = asiento.id_vuelo WHERE tbl_vuelo.id_vuelo = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, vuelo.getNumeroVuelo());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
            vuelo.setAerolinea(resultSet.getString(2));
            vuelo.setAeronave(resultSet.getString(3));
            vuelo.setCiudadDestino(resultSet.getString(4));
            vuelo.setCiudadOrigen(resultSet.getString(5));
            
            
            vuelo.setFechaPartida(resultSet.getString(6));
            vuelo.setFechaLlegada(resultSet.getString(7));
            
            
            vuelo.setHoraPartida(resultSet.getString(8));
            vuelo.setHoraLlegada(resultSet.getString(9));
            vuelo.setPrecioVuelo(resultSet.getFloat(10));
            vuelo.setEstadoVuelo(resultSet.getString(12));
            }
        } catch (SQLException ex) {
            Logger.getLogger(VuelosData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error al obtener el Vuelo: " + ex.getMessage());
        }
    }
    
}