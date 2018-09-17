package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.connector.Connector;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.repositories.CursoR;
import ar.com.eduit.curso.java.repositories.I_CursoR;
import java.sql.Connection;

public class TestRepositories {
    public static void main(String[] args) {
        Connection conn = Connector.getConnection();
        I_CursoR cr = new CursoR(conn);
        Curso curso = new Curso("PHP", "Torres", "Jueves", "Tarde");
        cr.save(curso);
        System.out.println(curso);
        
        System.out.println("****************************************************");
        //cr.getAll().forEach(System.out::println);     //Todos los cursos
        cr.getByTitulo("java").forEach(System.out::println);    //Cursos de java
    }           
}