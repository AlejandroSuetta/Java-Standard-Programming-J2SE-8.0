package clase07;

public class GeneradorDeExcepciones {
    public static void generar(){
        int[] vector=new int[5];
        vector[10]=1;
    }
    public static void generar(boolean x){
        if(x) System.out.println(10/0);
    }
    public static void generar(String nro){
        int n=Integer.parseInt(nro);
    }
    public static void generar(String texto,int pos){
        //if(texto==null) return;
        System.out.println(texto.charAt(pos));
    }
}