package PruebaTecnica.Clases;

public class Contacto {



    private String nombre;
    private Integer telefono;

    private String ciudad;

    public Contacto() {
    }

    public Contacto(String nombre, Integer telefono, String ciudad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
