/*
Implemente la clase Autor, sabiendo que se caracterizan por nombre, biografía y origen
y que deben permitir devolver/modificar el valor de sus atributos y devolver una
representación String formada por nombre, biografía y origen. 
 */
package tema3;

public class Autor {
    private String nombre;
    private String biografia;
    private String origen;

    public Autor(String nombre, String biografia, String origen) {
        this.nombre = nombre;
        this.biografia = biografia;
        this.origen = origen;
    }

    public Autor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return ("{"+"Nombre: "+this.nombre+", Biografia: "+this.biografia+", Origen: "+this.origen+"}");
    }
    
    
    
}
