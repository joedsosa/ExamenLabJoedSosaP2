package javaapplication67;

public class Zapatos extends Objeto {

    public Zapatos(String color, String descripcion, String marca, String tamano, String calidad, String personaQueLoIngreso) {
        super(color, descripcion, marca, tamano, calidad, personaQueLoIngreso);
    }

    private String talla;
    private String descripcionSuela;
    private String comodidad;

    public Zapatos(String color, String descripcion, String marca, String tamano, String calidad, String personaQueLoIngreso, String talla, String descripcionSuela, String comodidad) {
        super(color, descripcion, marca, tamano, calidad, personaQueLoIngreso);
        this.talla = talla;
        this.descripcionSuela = descripcionSuela;
        this.comodidad = comodidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDescripcionSuela() {
        return descripcionSuela;
    }

    public void setDescripcionSuela(String descripcionSuela) {
        this.descripcionSuela = descripcionSuela;
    }

    public String getComodidad() {
        return comodidad;
    }

    public void setComodidad(String comodidad) {
        this.comodidad = comodidad;
    }
}
