
package vuelo.Control;


/**
 *
 * @author Sebastian
 */
public class Vuelo {

    public int getIdvuelo() {
        return idvuelo;
    }

    public void setIdvuelo(int idvuelo) {
        this.idvuelo = idvuelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(String fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public float getPrecioVuelo() {
        return precioVuelo;
    }

    public void setPrecioVuelo(float precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getEstadoVuelo() {
        return estadoVuelo;
    }

    public void setEstadoVuelo(String estadoVuelo) {
        this.estadoVuelo = estadoVuelo;
    }

    public Vuelo(int idvuelo, String aerolinea, String aeronave, String ciudadDestino, String ciudadOrigen, String fechaPartida, String fechaLlegada, String horaPartida, String horaLlegada, float precioVuelo, String numeroVuelo, String estadoVuelo) {
        this.idvuelo = idvuelo;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.ciudadDestino = ciudadDestino;
        this.ciudadOrigen = ciudadOrigen;
        this.fechaPartida = fechaPartida;
        this.fechaLlegada = fechaLlegada;
        this.horaPartida = horaPartida;
        this.horaLlegada = horaLlegada;
        this.precioVuelo = precioVuelo;
        this.numeroVuelo = numeroVuelo;
        this.estadoVuelo = estadoVuelo;
    }

    public Vuelo(String aerolinea, String aeronave, String ciudadDestino, String ciudadOrigen, String fechaPartida, String fechaLlegada, String horaPartida, String horaLlegada, float precioVuelo, String numeroVuelo, String estadoVuelo) {
        this.idvuelo = -1;
        this.aerolinea = aerolinea;
        this.aeronave = aeronave;
        this.ciudadDestino = ciudadDestino;
        this.ciudadOrigen =  ciudadOrigen;
        this.fechaPartida = fechaPartida;
        this.fechaLlegada = fechaLlegada;
        this.horaPartida = horaPartida;
        this.horaLlegada = horaLlegada;
        this.precioVuelo = precioVuelo;
        this.numeroVuelo = numeroVuelo;
        this.estadoVuelo = estadoVuelo;
    }
    
    
  private int idvuelo;
  private String aerolinea;
  private String aeronave;
  private String ciudadDestino;//se cambio a string de int
  private String ciudadOrigen;//se cambio a string de int
  private String fechaPartida;//se cambio a String de longdate
  private String fechaLlegada;//se Cambio a String de longdate
  private String horaPartida;
  private String horaLlegada;
  private float precioVuelo;

    public int getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(int paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(int paisDestino) {
        this.paisDestino = paisDestino;
    }
  private int paisOrigen;
  private int paisDestino;
  
  
  
  
    public Vuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }
  private String numeroVuelo;
  private String estadoVuelo;
  

  
 
  }
    
