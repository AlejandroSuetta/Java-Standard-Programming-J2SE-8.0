package clase06;

public class Persona {
    String nombre;
    EstadoCivil estado;
    Genero genero;

    public Persona(String nombre, EstadoCivil estado, Genero genero) {
        this.nombre = nombre;
        this.estado = estado;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", estado=" + estado + ", genero=" + genero + '}';
    }
    
}
