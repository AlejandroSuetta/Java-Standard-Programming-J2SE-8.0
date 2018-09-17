package ar.com.eduit.curso.java.utils;

import ar.com.eduit.curso.java.interfaces.I_Archivo;

public class ArchivoTexto implements I_Archivo {

    @Override
    public String getText() {
        return "RetornandoArchivoTexto";
    }

    @Override
    public void setText(String text) {
        System.out.println("Escribiendo ArchivoTexto");
    }
    
}
