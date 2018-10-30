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
public class Ciudades {

    public int getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(int id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Ciudades(int id_ciudad, int pais, String ciudad, String strpais) {
        this.id_ciudad = id_ciudad;
        this.pais = pais;
        this.ciudad = ciudad;
        this.strpais = strpais;
    }

    public Ciudades(int pais, String ciudad) {
        this.id_ciudad = -1;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public Ciudades() {
        this.id_ciudad = id_ciudad;
    }
 
  private int id_ciudad;
  private int pais;
  private String ciudad;

    public String getStrpais() {
        return strpais;
    }

    public void setStrpais(String strpais) {
        this.strpais = strpais;
    }
  private String strpais;
}
