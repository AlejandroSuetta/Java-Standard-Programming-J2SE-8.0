package clase06; /* Clase 05 */

public class Clase06 { /* Clase 05 */

    public static void main(String[] args) {
        // Clase Object
        
        class X1 {
            int dato;

            public X1() {}

            public X1(int dato) {
                this.dato = dato;
            }

            @Override
            public String toString() {
                return this.dato + ""; /* Poner un String vacio convierte el int en un String*/
            }

            @Override
            public boolean equals(Object obj) {
                if (!(obj instanceof X1)) return false;
                //return this.dato == ((X1)obj).dato; /* De esta forma se pueden comparar los estados de los objetos y decir que si sus atributos son iguales, son el mismo objeto */
                return this.toString().equals(obj.toString()); /* Igual que el anterior, pero mejor para clases con muchos atributos */
            }

            @Override
            public int hashCode() {
                return toString().hashCode();
            } 
        }
        class X2 extends X1 {}
        
        System.out.println(X2.class.getName());
        
        X2 x2 = new X2();
        System.out.println(x2.getClass().getName());
        System.out.println(x2.getClass().getSimpleName());
        System.out.println(x2.getClass().getSuperclass().getSimpleName());
        System.out.println(x2.getClass().getSuperclass().getSuperclass().getName());
        System.out.println(
                    x2
                        .getClass()
                        .getSuperclass()
                        .getSuperclass()
                        .getSuperclass()
        );
        
        X1 xx1 = new X1(2); /* xx1 y xx2 son el mismo objeto*/
        X1 xx2 = xx1; /* Esto es como una referencia al lugar de memoria creado 
                         con la creacion de xx1 (no es una copia). Con datos 
                         primitivos no es asi. si hago int n = 1; int m = n; 
                         ahi si crea una copia con el mismo vaolr de n*/
        X1 xx3 = new X1(2); /* Tiene el mismo estado, pero no es el mismo objeto*/
        X1 xx4 = new X1(3);
        String xx5 = "2";
        
        System.out.println("xx1.hashCode()= " + xx1.hashCode()); /* Es como un ID que le da JAVA para identificar objetos */
        System.out.println("xx2.hashCode()= " + xx2.hashCode()); /* xx1 y xx2 tienen el mismo hashCode, o sea son el mismo objeto */
        System.out.println("xx3.hashCode()= " + xx3.hashCode());
        System.out.println("xx4.hashCode()= " + xx4.hashCode());
        System.out.println("xx5.hashCode()= " + xx5.hashCode());
        
        System.out.println("xx1.equals(xx1)=" + xx1.equals(xx1));
        System.out.println("xx1.equals(xx2)=" + xx1.equals(xx2));
        System.out.println("xx1.equals(xx3)=" + xx1.equals(xx3));
        System.out.println("xx1.equals(xx4)=" + xx1.equals(xx4));
        System.out.println("xx1.equals(xx5)=" + xx1.equals(xx5));
        

        //Clase String        
        //hasta JAVA 9
        //private final char value[];
        
        //JAVA 10 incorpora String compacto
        //private final byte value[];
        
        String cadena = "Hola soy una cadena de texto";
        String cadena2 = new String("Hola");
        char[] vector = {'h', 'o', 'l', 'a'};
        String cadena3 = new String(vector);
        
        //Métodos más comunes
        //.length()
        System.out.println(cadena.length());
        
        //.substring()
        System.out.println(cadena.substring(10)); /* Imprime desde el indice 10en adelante */
        System.out.println(cadena.substring(10, 15)); /* Imprime entre el indice 10 al 15 */
        
        //.toLowerCase() y .toUpperCase()
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        
        //.replace()
        System.out.println(cadena.replace('a', 'A'));
        
        //.containts
        System.out.println(cadena.contains("hola")); /* Devuelve boolean si tiene la subcadena (lo que esta entre ()) dentro de la cadena */
        System.out.println(cadena.contains("cadena"));
        
        String texto = "";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "h";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "o";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "l";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "a";
        System.out.println(texto + "\t" + texto.hashCode());
        
        //Clase StringBuffer y StringBuilder
        /* StringBuffer y Builder se usan exactamente igual. Builder es mas moderno */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("h");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("o");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("l");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("a");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        
        //Clase System
        
        //Atributo out, err, in
        //out: proporciona un stream sincronizado de salida a consola.
        //err: proporciona un stream no sincronizado de salida a consola.
        //in: proporciona un sream de entrada a consola. 
        
        System.out.println("hola 1");
        System.out.println("hola 2");
        System.out.println("hola 3");
        System.out.println("hola 4");
        System.out.println("hola 5");
        System.out.println("hola 6");
        System.out.println("hola 7");
        System.out.println("hola 8");
        System.out.println("hola 9");
        System.out.println("hola 10");
        System.out.println("hola 11");
        System.out.println("hola 12");
        System.out.println("hola 13");
        System.out.println("hola 14");
        System.out.println("hola 15");
        System.out.println("hola 16");
        System.out.println("hola 17");
        System.out.println("hola 18");
        System.out.println("hola 19");
        System.out.println("hola 20");
        System.err.println("Ocurrio un eror"); /* Evita la cola de espera, y se imprime inmediatamente y luego seguir con la impresion. Siempre sale en lugares distintos*/
    
        //Método exit() (Cierra el programa)
        //System.exit(0);
        System.out.println("Esta linea no se ejecuta");
        
        //Método grtProperties()
        System.out.println(System.getProperties());
        
        System.getProperties().forEach((k,v)->System.out.println(k + ": " + v));
        System.out.println("----------------------------------------------------");
        
        //Método getProperty()
        System.out.println(System.getProperty("user.name"));
        
        //Método getenv()
        System.getenv().forEach((k,v)->System.out.println(k + ": " + v));
        System.out.println("----------------------------------------------------");
        System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));
        
    }
}
