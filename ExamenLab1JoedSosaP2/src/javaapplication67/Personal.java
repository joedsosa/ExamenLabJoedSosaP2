package javaapplication67;

public class Personal extends Persona {

    private String ocupacion;
    private String horario;
    private String tiempoLaborando;
    private String sueldo;

    public Personal(String identificacion, String nombre, String edad, String sexo, String estadoCivil, String altura, String peso) {
        super(identificacion, nombre, edad, sexo, estadoCivil, altura, peso);
    }

    public Personal(String identificacion, String nombre, String edad, String sexo, String estadoCivil, String altura, String peso, String ocupacion, String horario, String tiempoLaborando, String sueldo) {
        super(identificacion, nombre, edad, sexo, estadoCivil, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempoLaborando = tiempoLaborando;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTiempoLaborando() {
        return tiempoLaborando;
    }

    public void setTiempoLaborando(String tiempoLaborando) {
        this.tiempoLaborando = tiempoLaborando;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
}
