package ar.com.eduit.curso.java.connector;

import java.sql.Connection;
import java.sql.DriverManager;

public final class Connector {
    private static String driver = "com.mysql.jdbc.Driver"; //driver 5
    //private static String driver = "com.mysql.cj.jdbc.Driver"; //driver 6 o superior
    private static String vendor = "mysql";
    private static String server = "localhost";
    private static String port = "3306";
    private static String db = "colegio";
    private static String params = "";
    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:" + vendor + "://" + server + ":" + port + "/" + db + params;
    private static Connection conn = null;
    private Connector(){};
    public synchronized static Connection getConnection() {
        if(conn == null) {
            try {
                Class.forName(driver); //Crea un objeto clase de lo que se declara en el parametro String.
                conn = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                e.printStackTrace(); //imprime el error en consola de error, si existice
            }
        }
        return conn;
    }
}