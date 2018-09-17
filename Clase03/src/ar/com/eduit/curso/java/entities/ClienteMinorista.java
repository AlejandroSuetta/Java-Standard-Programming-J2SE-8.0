package ar.com.eduit.curso.java.entities;

public class ClienteMinorista extends Persona{
    private int nroCliente;
    private Cuenta cuenta;

    public ClienteMinorista(int nroCliente, Cuenta cuenta, String nombre, String apellido, Direccion direccion, int edad) {
        super(nombre, apellido, direccion, edad);
        this.nroCliente = nroCliente;
        this.cuenta = cuenta;
    }
    
    @Override
    public void saludar() {System.out.println("Hola soy un cliente");}

    @Override
    public String toString() {
        return super.toString() + " ClienteMinorista{" + "nroCliente=" + nroCliente + ", cuenta=" + cuenta + '}';
    }

    public int getNroCliente() { return nroCliente; }
    public Cuenta getCuenta()  { return cuenta;     }    
}
