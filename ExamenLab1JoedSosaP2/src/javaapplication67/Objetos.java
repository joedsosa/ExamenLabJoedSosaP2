
package javaapplication67;

public class Objetos extends Objeto {
    private String descripcionLugar;
    private String instrucciones;
    private String tiempoGarantia;

    public Objetos(String color, String descripcion, String marca, String tamano, String calidad, String personaQueLoIngreso, String descripcionLugar, String instrucciones, String tiempoGarantia) {
        super(color, descripcion, marca, tamano, calidad, personaQueLoIngreso);
        this.descripcionLugar = descripcionLugar;
        this.instrucciones = instrucciones;
        this.tiempoGarantia = tiempoGarantia;
    }

    public String getDescripcionLugar() {
        return descripcionLugar;
    }

    public void setDescripcionLugar(String descripcionLugar) {
        this.descripcionLugar = descripcionLugar;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getTiempoGarantia() {
        return tiempoGarantia;
    }

    public void setTiempoGarantia(String tiempoGarantia) {
        this.tiempoGarantia = tiempoGarantia;
    }
}