package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.interfaces.I_Archivo;
import ar.com.eduit.curso.java.utils.ArchivoBuffer;
import ar.com.eduit.curso.java.utils.ArchivoTexto;

public class TestInterfaces {
    public static void main(String[] args) {
        I_Archivo archivo;
        
        //archivo = new ArchivoTexto(); /*Elij ouna o la otra*/
        archivo = new ArchivoBuffer();
        
        archivo.setText("Hola");
        System.out.println(archivo.getText());
        archivo.info();
    }
}
