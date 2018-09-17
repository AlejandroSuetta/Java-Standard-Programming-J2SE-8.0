package clase02;

import javax.swing.JOptionPane;

public class Clase02 {

    public static void main(String[] args) {
        // Clase 02 POO
        
        //Clase: Todo lo que es sustantivo se puede representar
        //como una clase, Alumno Silla Monitor.
        
        //declaracion de clase interna
        class Auto{
            //Atributos
            String marca;
            String modelo;
            String color;
            int velocidad;
            //Métodos constructores
            /**
             * Método deprecado por Carlos Rios el 21/05/2018
             * por ser inseguro, usar en su reemplazo 
             * Auto(String marca,String modelo,String color)
             * @deprecated
             */
            @Deprecated
            Auto(){} //Constructor vacio
            Auto(String marca,String modelo,String color){
                this.marca=marca;
                this.modelo=modelo;
                this.color=color;
                this.velocidad=0;
            }
            
            //Métodos
            void acelerar() {               //acelerar
                //velocidad+=10; 
                //if(velocidad>100) velocidad=100;
                acelerar(10); //Llamado de métodos a la misma clase
            }
            //SobreCarga de Métodos
            void acelerar(int kilometros){         //acelerarInt
                velocidad+=kilometros;
                if(velocidad>100) velocidad=100;
            }
            void frenar()   { 
                velocidad-=10; 
                if(velocidad<0) velocidad=0;
            }
            void imprimirVelocidad(){ System.out.println(velocidad); }
            int getVelocidad(){ return velocidad; }
            @Override
            public String toString(){
                return marca+" "+modelo+" "+color+" "+velocidad;
            }
        }//end class Auto
        
        System.out.println("-- auto1 --");
        Auto auto1=new Auto(); //construye un objeto de la clase Auto.
        auto1.marca="Ford";
        auto1.modelo="Fiesta";
        auto1.color="Azul";
        auto1.acelerar();           // 10
        auto1.acelerar();           // 20
        auto1.acelerar();           // 30
        auto1.frenar();             // 20
        System.out.println(auto1.marca+" "+auto1.modelo+" "
                +auto1.color+" "+auto1.velocidad);
        //Los atributos númericos se inicializan en 0.
        //Los atributos String o Object se inicializan en null.
        
        int x;
        //System.out.println(x);
        //Error no se puede usar una variable no inicializada.       
        String text;
        //System.out.println(text);
        
        System.out.println("-- auto2 --");
        Auto auto2=new Auto();
        auto2.marca="Fiat";
        auto2.modelo="Idea";
        auto2.color="Rojo";
        for(int a=0;a<=38;a++) auto2.acelerar();        //390
        
        auto2.frenar();     //90
        auto2.frenar();     //80
        auto2.frenar();     //70
        auto2.frenar();     //60
        auto2.frenar();     //50
        auto2.frenar();     //40
        auto2.frenar();     //30
        auto2.frenar();     //20
        auto2.acelerar();   //30
        auto2.acelerar(25); //55

        System.out.println(auto2.marca+" "+auto2.modelo+" "
                +auto2.color+" "+auto2.velocidad);
        
        
        System.out.println("-- auto3 --");
        Auto auto3=new Auto("Citroen", "C4", "Bordo");
        auto3.imprimirVelocidad();
        System.out.println(auto3.getVelocidad());
        int velocidad=auto3.getVelocidad();
        System.out.println(velocidad);
        //JOptionPane.showMessageDialog(null, "Velocidad:"+auto3.getVelocidad());
        
        //Método toString()
        System.out.println(auto3.toString());
        System.out.println(auto3);
        
        //Libro
        System.out.println("-- libro1 --");
        Libro libro1=new Libro(1, "Biblia de Java", "Jhon Smith", "ABC");
        System.out.println(libro1);
        
        //libro1.titulo="ScoobyDo PAPA";
        libro1.setTitulo("Scooby Doo Papa!!");
        
        /*
            Modificadores de visibilidad
        
        Modificador         Alcance
        default(omitido)    La misma clase y clases del mismo paquete.
        public              Desde la misma clase y cualquier clase.
        private             Solo desde la misma clase.
        protected           Desde la misma clase y clases del mismo paquete
                            y desde clases hijas.
        */
        
    }//end main
    
}//end class Clase02
