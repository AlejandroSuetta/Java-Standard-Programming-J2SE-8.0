package clase01;

import javax.swing.JOptionPane;

/**
 * Clase principal del proyecto Clase01
 * @author EducaciónIT
 */
public class Clase01 
{
    /**
    *punto de entrada del proyecto
    * @param args Argumentos que ingresan por consola
    */
    public static void main(String[] args) 
    {
        /*
        Curso: Java Standard Programming 8.x 40 horas
        Dias: Lunes y Miércoles 09:00 a 13:00
        Profe: Carlso Ríos carlos.rios@educacionit.com.ar
        Materiales: alumni.educacionit.com
        user: email     pass: dni
        Material extra: www.javaya.com.ar
        
        Software: JDK 8.x       www.oracle.com
                  Netbeans IDE 8.x      www.netbeans.org
        
        JDK: Java Development Kit
        JDK Alternativo: OpenJDK (linux)
        
        IDEs: Integrated Development Kit 
        IDEs Alternativos: Eclipse, IntelliJ, JDeveloper
        */
        
        // Linea de comentarios
        
        /* Bloque de comentarios */
        
        /**
         * Comentario Java Doc
         * El comentario Java Doc deve comentarse antes de la declaraciñon de 
         * clases o métodos (aca, donde esta escrito, no sirve)
         */ 
        
        //Tipo de datos primitivos
        
        // Tipo var (solo para jdk10)
        //var numero = 10;        //Se crea una variable int
        //var numero2 = 20.7f;    //Se crea una variable float
        //var car = 'A';          //Se crea una variable char
        
        //Tipo de datos boolean (1 Byte)
        boolean bo = true;      // Guarda un 1 internamente
        //sout + TAB = System.out.println("")
        System.out.println(bo);
        bo = false;             // Guarda un 0 internamente
        System.out.println(bo);
        
        //Tipo de dato byte, signed (1 byte)
        byte by = 100;
        by = -120;
        
        /*Crea un vector de 256 lugares
            byte by;
        
            |--------|--------|
          -128       0       127
          ByteU     byU   (Unsigned) No disponible en Java
        
            |----------------|
            0               255
        */
        
        //Tipo de datos short (2 bytes)
        short sh = 20000;
        sh = -20000;
        
        // Tipo de dato int (4 byte)
        int in = 2000000000;
        in = -2000000000;
        
        //Tipo de datos long (8 bytes)
        long lo = 2000000000;
        lo = 3000000000L; //agrego la L para que indique que es un lomg
        
        //Tipo de dato float (32 bits)
        float fl = 4.25f;

        //Tipo de dato double (64 bits)
        double dl = 4.25;
        
        fl = 10;
        dl = 10;
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        fl = 100;
        dl = 100;
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        //Tipo de dato char INICODE (2 byte)
        char ch = 65;
        
        System.out.println(ch);
        ch += 32;   //Sumo 32 a ch
        System.out.println(ch);
        
        //Clase String
        String st = "Hola, soy una cadena de texto";
        System.out.println(st);
        
        //Recorrer el vector st
        for (int a = 0; a < st.length(); a++) System.out.print(st.charAt(a));
        System.out.println();
        
        //Imprimir st en mayuscula
        for (int a = 0; a < st.length(); a++){
            char car = st.charAt(a);
            
            if (car >= 97 && car <= 122) car -= 32;
            System.out.print(car);
        }
        System.out.println();
        
        //Operador ternario ?
        for (int a = 0; a < st.length(); a++){
            char car = st.charAt(a);
            
            System.out.print((car >= 97 && car <= 122)?(car -= 32):car);
        }
        System.out.println();
        
        //Imprimir st en minusculas
        for (int a = 0; a < st.length(); a++){
            char car = st.charAt(a);
            
            System.out.print((car >= 56 && car <= 90)?(car+=32):car);
        }
        System.out.println();
        
        System.out.println(st.toUpperCase()); //Para cambiar un String a mayuscula
        System.out.println(st.toLowerCase()); //Para cambiar un String a minuscula
        
        JOptionPane.showMessageDialog(null, "Hola");
        
    } //end main
} //end class Clase01