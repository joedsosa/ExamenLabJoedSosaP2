package javaapplication67;

public class Gerente extends Persona {

    private String usuario;
    private String contrasena;
    private String cargo;

    public Gerente(String identificacion, String nombre, String edad, String sexo, String estadoCivil, String altura, String peso) {
        super(identificacion, nombre, edad, sexo, estadoCivil, altura, peso);
    }

    public Gerente(String identificacion, String nombre, String edad, String sexo, String estadoCivil, String altura, String peso, String usuario, String contrasena, String cargo) {
        super(identificacion, nombre, edad, sexo, estadoCivil, altura, peso);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
