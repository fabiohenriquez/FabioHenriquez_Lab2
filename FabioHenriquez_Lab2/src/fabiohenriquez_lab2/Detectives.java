/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabiohenriquez_lab2;

public class Detectives {
    private String Nombre;
    private String Nacionalidad;
    private String Edad;
    private String Años_L;
    private int Nivel;
    private String ListaC;
    private String Buzon;
    private String Usuario;
    private String Contraseña;

    public Detectives() {
    }

    public Detectives(String Nombre, String Nacionalidad, String Edad, String Años_L, int Nivel, String ListaC, String Buzon, String Usuario, String Contraseña) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Edad = Edad;
        this.Años_L = Años_L;
        this.Nivel = Nivel;
        this.ListaC = ListaC;
        this.Buzon = Buzon;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setAños_L(String Años_L) {
        this.Años_L = Años_L;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public void setListaC(String ListaC) {
        this.ListaC = ListaC;
    }

    public void setBuzon(String Buzon) {
        this.Buzon = Buzon;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getBuzon() {
        return Buzon;
    }
    
    @Override
    public String toString() {
        return "Detectives : " + "Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + ", Edad=" + Edad + ", Años Laborando" + Años_L + ", Nivel=" + Nivel + ", Lista de Casos =" + ListaC + ", Buzon=" + Buzon + ", Usuario=" + Usuario + ", Contraseña =" + Contraseña + '}';
    }
    
    
    
    
    
    
    
}
