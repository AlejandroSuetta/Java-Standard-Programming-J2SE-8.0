package ar.com.eduit.curso.java.repositories;

import ar.com.eduit.curso.java.entities.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CursoR implements I_CursoR{
    private Connection conn;

    public CursoR(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Curso curso) {
        //String query="insert into cursos (titulo,profesor,dia,turno) values "
        //        + "('"+curso.getTitulo()+"','"+curso.getProfesor()+"',"
        //        + "'"+curso.getDia()+"','"+curso.getTurno()+"')";
        // titulo=java
        // profe=xx
        // dia=lunes
        // turno=noche');delete from cursos; -- 

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "Insert into cursos (Titulo,profesor, dia, turno) values (?,?,?,?)", 
                        PreparedStatement.RETURN_GENERATED_KEYS //devuelve la clave generada (el id generado por la base de datos)
            );
            ps.setString(1, curso.getTitulo()); //Para ingresar los datos
            ps.setString(2, curso.getProfesor());
            ps.setString(3, curso.getDia());
            ps.setString(4, curso.getTurno());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) curso.setId(rs.getInt(1));
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public void remove(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<Curso>getByFiltro(String filtro) {
        List<Curso> lista = new ArrayList();
        try {
            ResultSet rs = conn
                    .prepareStatement("select * from cursos where " + filtro)
                    .executeQuery();
            while(rs.next()) {
                lista.add(new Curso(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("profesor"),
                        rs.getString("dia"),
                        rs.getString("turno")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    @Override
    public Curso getByID(int id) {
        List<Curso>lista = getByFiltro("id=" +id);
        return (lista.isEmpty()) ? null : lista.get(0);
    }

    @Override
    public List<Curso> getAll() {
        return getByFiltro("1 = 1");
    }

    @Override
    public List<Curso> getByTitulo(String titulo) {
        return getByFiltro("titulo='" + titulo + "'");
    }

    @Override
    public List<Curso> getLikeTitulo(String titulo) {
        return getByFiltro("titulo like '%" + titulo + "%'");
    }

    @Override
    public List<Curso> getByProfesor(String profesor) {
        return getByFiltro("profesor='" + profesor + "'"); 
    }

    @Override
    public List<Curso> getLikeProfesor(String profesor) {
        return getByFiltro("titulo like %'" + profesor + "%'");
    }

    @Override
    public List<Curso> getByDia(String dia) {
        return getByFiltro("dia='" + dia + "'");
    }

    @Override
    public List<Curso> getLikeDia(String dia) {
        return getByFiltro("dia like %'" + dia + "%'");
    }

    @Override
    public List<Curso> getByTurno(String turno) {
        return getByFiltro("turno='" + turno + "'");
    }
    
}
