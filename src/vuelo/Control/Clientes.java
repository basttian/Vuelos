/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuelo.Control;

/**
 *
 * @author Sebastian
 */
public class Clientes {
    
    int idCliente = -1 ;
    String nombre;
    String pasaporte;
    String tarjeta;
    
    public Clientes(int idCliente, String nombre, String pasaporte, String tarjeta) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.tarjeta = tarjeta;
    }
    
        public Clientes(String nombre, String pasaporte, String tarjeta) {
        this.idCliente = -1;
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.tarjeta = tarjeta;
    }
        public Clientes(){
        this.idCliente = -1;
        }
        
    public Clientes(String pasaporte) { 
        this.pasaporte = pasaporte;
    }
        
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }
   
    
}
