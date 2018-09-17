package ar.com.eduit.curso.java.entities;

public class Empleado extends Persona{
    private int nroLegajo;
    private float sueldoBasico;

    public Empleado(int nroLegajo, float sueldoBasico, String nombre, String apellido, Direccion direccion, int edad) {
        super(nombre, apellido, direccion, edad);
        this.nroLegajo = nroLegajo;
        this.sueldoBasico = sueldoBasico;
    }
    
    @Override /*Conviene agregar el Override, ya que saludar() existe en la clase padre (No es obligatorio)*/
    public void saludar() { System.out.println("Hola soy un empleado"); }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" + "nroLegajo=" + nroLegajo + ", sueldoBasico=" + sueldoBasico + '}'; /*super.toString() es para llamar al toString de la clase padra y que aparesca en el toString() del hijo*/
    }

    public int getNroLegajo()      { return nroLegajo;    }
    public float getSueldoBasico() { return sueldoBasico; }
}
