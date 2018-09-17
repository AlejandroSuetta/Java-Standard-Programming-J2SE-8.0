package ar.com.eduit.curso.java.interfaces;

public interface I_Archivo {
    /*
    Una interface es un contrato de métodos.
    Todos los miembros de una interface son públicos.
    No pueden existir constructores ni atributos, solo métodos únicos.
    Los métodos no tienen código. La clase que implementa la interface es la que 
    escribe el código dentro del método.
    Una clase puede implementar todas las interfaces que necesite.
    */
    String getText();
    void setText(String text);
    
    //Métodos default jdk8 o superior
    //Los métodos default tienen código
    public default void info() {
        System.out.println("Interface I_Archivo");
    }
    
}
