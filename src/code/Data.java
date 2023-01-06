package code;

/**
 *
 * @author 7R0N1X
 */
public class Data {

    private String salida, destino, fecha, hora;

    public Data() {
        this.salida = "";
        this.destino = "";
        this.fecha = "";
        this.hora = "";
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
