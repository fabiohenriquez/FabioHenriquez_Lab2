/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabiohenriquez_lab2;

public class Mensajes {

private String Emisor;
private String Receptor;
private String Contenido;
private String Prioridad;

    public Mensajes() {
    }

    public Mensajes(String Emisor, String Receptor, String Contenido, String Prioridad) {
        this.Emisor = Emisor;
        this.Receptor = Receptor;
        this.Contenido = Contenido;
        this.Prioridad = Prioridad;
    }

    public String getEmisor() {
        return Emisor;
    }

    public String getReceptor() {
        return Receptor;
    }

    public String getContenido() {
        return Contenido;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    @Override
    public String toString() {
        return "Mensajes: " + "Emisor: " + Emisor + ", Receptor: " + Receptor + ", Contenido: " + Contenido + ", Prioridad: " + Prioridad + '}';
    }
    
   
    
    
    
    
}
