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
public class Asientos {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Asientos(int id, int idvuelo, String ubicacion, String posicion, boolean disponibilidad, float precio) {
        this.id = id;
        this.idvuelo = idvuelo;
        this.ubicacion = ubicacion;
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    public Asientos(int idvuelo, String ubicacion, String posicion, boolean disponibilidad, float precio) {
        this.idvuelo = idvuelo;
        this.ubicacion = ubicacion;
        this.posicion = posicion;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }
    
    private int id ;

    public Asientos() {
        this.idvuelo = idvuelo;
    }
    private int idvuelo;
    private String ubicacion;
    private String posicion;
    private boolean disponibilidad;
    private float precio;
    
}
