package javaapplication67;

public class Objeto {

    public Objeto() {
    }

    private String color;
    private String descripcion;
    private String marca;
    private String tamano;
    private String calidad;
    private String personaQueLoIngreso;

    public Objeto(String color, String descripcion, String marca, String tamano, String calidad, String personaQueLoIngreso) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.personaQueLoIngreso = personaQueLoIngreso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getPersonaQueLoIngreso() {
        return personaQueLoIngreso;
    }

    public void setPersonaQueLoIngreso(String personaQueLoIngreso) {
        this.personaQueLoIngreso = personaQueLoIngreso;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", tamano=" + tamano + ", calidad=" + calidad + ", personaQueLoIngreso=" + personaQueLoIngreso + '}';
    }
}
