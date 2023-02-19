package javaapplication67;

public class Ropa extends Objeto {

    public Ropa() {
    }

    private String talla;
    private String tipoTela;
    private String paisElaboracion;

    public Ropa(String color, String descripcion, String marca, String tamano, String calidad, String personaQueLoIngreso, String talla, String tipoTela, String paisElaboracion) {
        super(color, descripcion, marca, tamano, calidad, personaQueLoIngreso);
        this.talla = talla;
        this.tipoTela = tipoTela;
        this.paisElaboracion = paisElaboracion;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getPaisElaboracion() {
        return paisElaboracion;
    }

    public void setPaisElaboracion(String paisElaboracion) {
        this.paisElaboracion = paisElaboracion;
    }
}

