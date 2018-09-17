package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.connector.Connector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnector {
    public static void main(String[] args) throws Exception {
        Connection conn = Connector.getConnection();
        Statement stm = conn.createStatement();
        String query = "insert into cursos (titulo, profesor, dia, turno) " 
                        + "values ('Java', 'Rios', 'Lunes', 'Mañana')";
        stm.execute(query);
        
        //execute() ejecuta una query insert, upade o delete y devuelve siempre true (haga el comando o no).
        //si la query es del tipo select devuelve false.
        //executeUpdate() ejecuta una query insert, upade o delete y devuelve un entero con la cantidad de registros modificados.
        //executeQuery("") ejecuta una query del tipo select y devuelve un ResultSetcon los registros obtenidos.
        Connector.getConnection().createStatement().execute(
        "insert into cursos (titulo, profesor, dia, turno) values "
        + "('HTML', 'Gomez', 'Martes', 'Noche')");
        
        ResultSet rs = Connector.getConnection().createStatement().executeQuery("select * from cursos");
        while(rs.next()) {
            System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("titulo") + "\t" +
                    rs.getString("profesor") + "\t" +
                    rs.getString("dia") + "\t" +
                    rs.getString("turno"));
        }
    }
}