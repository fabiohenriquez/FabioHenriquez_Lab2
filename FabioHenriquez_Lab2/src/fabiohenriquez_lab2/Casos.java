
package fabiohenriquez_lab2;

public class Casos {

private String Lugar;
private String Descripcion  ;
private String Tipo ;
private String D_A ;
private String Estado;   
    
    
    public Casos() {
    }

    public Casos(String Lugar, String Descripcion,String Tipo,String D_A, String Estado) {
        this.Lugar = Lugar;
        this.Descripcion = Descripcion;
        this.Tipo = Tipo;
        this.D_A = D_A;
        this.Estado = Estado;
    }

    public String getLugar() {
        return Lugar;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getD_A() {
        return D_A;
    }

    public String getEstado() {
        return Estado;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setD_A(String D_A) {
        this.D_A = D_A;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    @Override
    public String toString() {
        return "Casos{" + "Lugar=" + Lugar + ", Descripcion=" + Descripcion + ", Tipo=" + Tipo + ", Detective a Cargo=" + D_A + ", Estado=" + Estado + '}';
    }
    
    
    
    
}
