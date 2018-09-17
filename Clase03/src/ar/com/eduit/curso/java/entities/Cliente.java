package ar.com.eduit.curso.java.entities;
public class Cliente {
    private int nro;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    public Cliente(int nro, String nombre, String apellido, int nroCuenta) {
        this.nro=nro;
        this.nombre=nombre;
        this.apellido=apellido;
        this.cuenta=new Cuenta(nroCuenta,"arg$");
    }
    @Override
    public String toString() {
        return "Cliente{" + "nro=" + nro + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    public Cuenta getCuenta() {
        return this.cuenta;
    }
}
