package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.ClienteMinorista;
import ar.com.eduit.curso.java.entities.Cuenta;
import ar.com.eduit.curso.java.entities.Direccion;
import ar.com.eduit.curso.java.entities.Empleado;
import ar.com.eduit.curso.java.entities.Persona;

public class TestHrencia {
    public static void main(String[] args) { /*psvm par generar un main rapido*/
        System.out.println("-- dir1 --");
        Direccion dir1 = new Direccion("Lavalle", "648", "8", "a");
        System.out.println(dir1);
        
        System.out.println("-- dir2 --");
        Direccion dir2 = new Direccion("Belgrano", "42", "", "", "Moron");
        System.out.println(dir2);
        
        /*
        System.out.println("-- persona1 --");
        Persona persona1 = new Persona("Melina", "Moroni", dir1, 40);
        System.out.println(persona1);
        persona1.saludar();
        
        System.out.println("-- persona2 --");
        Persona persona2 = new Persona(
                "Karina", 
                "Vazques", 
                new Direccion("Lima", "222", "1", "a"), 
                50);
        Direccion dirPersona2  = persona2.getDireccion();
        System.out.println(persona2);
        persona2.saludar();
        */
        
        System.out.println("-- empleado1 --");
        Empleado empleado1 = new Empleado(1, 30000, "Nadia", "Leon", dir2, 50);
        System.out.println(empleado1);
        empleado1.saludar();
        
        System.out.println("-- cm1 --");
        ClienteMinorista cm1 = new ClienteMinorista(
                1,
                new Cuenta(20, "arg$"),
                "Mariela",
                "Casimiro",
                new Direccion ("Larrea", "221", "", ""),
                50);
        cm1.getCuenta().depositar(50000);
        System.out.println(cm1);
        System.out.println(cm1.getCuenta());
        cm1.saludar();
        
        System.out.println("-------------------------------------------------");
        //Polimorfismo
        Persona p1 = new Empleado(10, 20000, "Javier", "Larrosa", dir1, 38);
        Persona p2 = new ClienteMinorista(2, new Cuenta(5, "arg$"), "Ana", "Godoy", dir2, 40);
        
        p1.saludar();
        p2.saludar();
        
        Object obj = p1; /*Object es padre de todas las clases, y por default lo es*/
        obj = 23;
        
        Empleado e1 = (Empleado)p1; /*Paradecirle a JAVA que es un empleado (Se llama casteo)*/
        Empleado e2 = (p1 instanceof Empleado) ? (Empleado)p1 : null;
    }
}