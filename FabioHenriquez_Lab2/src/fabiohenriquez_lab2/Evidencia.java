
package fabiohenriquez_lab2;


public class Evidencia {

private String nombre;
private String Descripcion;
private String Nivel_P;

    public Evidencia() {
    }

    public Evidencia(String nombre, String Descripcion, String Nivel_P) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
        this.Nivel_P = Nivel_P;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setNivel_P(String Nivel_P) {
        this.Nivel_P = Nivel_P;
    }

    @Override
    public String toString() {
        return "Evidencia{" + "nombre=" + nombre + ", Descripcion=" + Descripcion + ", Nivel de Peligrosidad=" + Nivel_P + '}';
    }
    

    
}
