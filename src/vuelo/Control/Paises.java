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
public class Paises {


   private int cod_pais;
   private String pais;

    public int getCod_pais() {
        return cod_pais;
    }

    public void setCod_pais(int cod_pais) {
        this.cod_pais = cod_pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
     
        public Paises( int cod_pais, String pais) {

        this.cod_pais = cod_pais;
        this.pais = pais;
    }
        
        public Paises( String pais) {
        this.cod_pais = cod_pais;
        this.pais = pais;
    }  
         public Paises() {
        this.cod_pais = cod_pais;
    }
        
}
