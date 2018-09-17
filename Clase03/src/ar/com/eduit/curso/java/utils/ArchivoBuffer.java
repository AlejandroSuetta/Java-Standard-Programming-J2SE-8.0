package ar.com.eduit.curso.java.utils;

import ar.com.eduit.curso.java.interfaces.I_Archivo;

public class ArchivoBuffer implements I_Archivo{

    @Override
    public String getText() {
        return "RetornandoArchivoBuffer";
    }

    @Override
    public void setText(String text) {
        System.out.println("Esccribiendo ArchivoBuffer");
    }
    
}
