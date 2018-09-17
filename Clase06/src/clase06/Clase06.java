package clase06;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Clase06 {
    public static void main(String[] args) {
        // Clase 06 Collections
        
        // Vector
        Auto[] autos=new Auto[4];
        autos[0]=new Auto("Fiat","Idea","Rojo");
        autos[1]=new Auto("Ford","Focus","Verde");
        autos[2]=new Auto("VW","Polo","Azul");
        autos[3]=new Auto("Peugeot","207","Negro");
        
        //Recorrido con indices
        //for(int a=0;a<autos.length;a++) System.out.println(autos[a]);
        //Recorrido con forEach
        //for(Auto auto:autos) System.out.println(auto);
        //Recorrido Java8
        //Arrays.asList(autos).forEach(item->System.out.println(item));
        Arrays.asList(autos).forEach(System.out::println);
        
        //Interface List
        
        //Lista tipo Object
        List lista=new ArrayList();
        lista.add(new Auto("VW","Gol","Blanco"));
        lista.add(new Auto("Citroen","C4","Bordo"));
        lista.add("hola");
        lista.add(23);
        
        //copiar los autos de autos en la lista
        //for(Auto auto:autos) lista.add(auto);
        lista.addAll(Arrays.asList(autos));
        
        System.out.println("------------------------------------------");
        //Recorrido con indices
        //for(int a=0;a<lista.size();a++) System.out.println(lista.get(a));
        //Recorrido forEach
        //for(Object obj:lista) System.out.println(obj);
        //Recorrido java8
        lista.forEach(System.out::println);
        
        //Uso de Generics <> a partir de JDK 5
        List<Auto> lista2=new ArrayList();
        lista2.add(new Auto("Renault","Clio","Rojo"));
        lista2.add(new Auto("Fiat","Duna","Blanco"));
        
        Auto auto1=(Auto)lista.get(0);
        Auto auto2=lista2.get(0);
        
        //Copiar los autos de lista a lista2
        for(Object obj:lista){
            if(obj instanceof Auto) lista2.add((Auto)obj);
        }
        
        //Recorrido de lista2
        System.out.println("---------------------------");
        lista2.forEach(System.out::println);
        
        
        //Interface SET
        Set<Auto> set;
        
        //Implementacion HashSet
        //Es la mas veloz no garantiza el orden de los elementos.
        set=new HashSet();
        set.addAll(lista2);
        set.add(new Auto("Fiat","Duna","Blanco"));
        System.out.println("-------------------");
        set.forEach(System.out::println);
        
        //Implementacion LinkedHashSet
        //Almacena los elementos en una lista enlazada, por orden de ingreso
        set=new LinkedHashSet();
        set.addAll(lista2);
        set.add(new Auto("Fiat","Duna","Blanco"));
        System.out.println("-------------------");
        set.forEach(System.out::println);
        
        //Implementacion TreeSet
        //Almacena los elementos en un arbol por orden natural
        set=new TreeSet(); 
        set.addAll(lista2);
        set.add(new Auto("Fiat","Duna","Blanco"));
        System.out.println("-------------------");
        set.forEach(System.out::println);
        
        //Pilas Stack LIFO Last In First Out
        Stack<Auto> pilaAutos=new Stack();
        pilaAutos.push(new Auto("Chevrolet","Onix","Gris"));
        //metodo push() apila un elemento en la lista.
        pilaAutos.addAll(lista2);
        System.out.println("Longitud de pila="+pilaAutos.size());
        while(!pilaAutos.isEmpty()){
            System.out.println(pilaAutos.pop());
            //metodo pop() desapila un elemento
        }
        System.out.println("Longitud de pila="+pilaAutos.size());
        
        //Clase ArrayDeque Colas 
        Queue<Auto> colaAutos=new ArrayDeque();
        //Queue<Auto>colaAutos=new LinkedList();
        colaAutos.offer(new Auto("Renault","Duster","Bordo"));
        // metodo offer() encola un elemento
        colaAutos.addAll(lista2);
        System.out.println("Longitud de cola:"+colaAutos.size());
        while(!colaAutos.isEmpty()){
            System.out.println(colaAutos.poll());
            //.poll() descola un elemento
        }
        System.out.println("Longitud de cola:"+colaAutos.size());
        
        // Mapas en java
        // Interface Map
        Map<String,String>mapaSemana;
        
        //Implementacion HashMap, es la mas veloz no garantiza el orden
        mapaSemana=new HashMap();
        mapaSemana.put("lu", "lunes");
        mapaSemana.put("ma", "martes");
        mapaSemana.put("mi", "miercoles");
        mapaSemana.put("ju", "jueves");
        mapaSemana.put("vi", "viernes");
        //System.out.println(mapaSemana.get("ju"));
        System.out.println("--------------------");
        mapaSemana.forEach((k,v)->System.out.println(k+": "+v));
        
        //Implementacion LinkedHashMap, almacena los elementos en una lista
        //enlazada, por orden de ingreso
        mapaSemana=new LinkedHashMap();
        mapaSemana.put("lu", "lunes");
        mapaSemana.put("ma", "martes");
        mapaSemana.put("mi", "miercoles");
        mapaSemana.put("ju", "jueves");
        mapaSemana.put("vi", "viernes");
        //System.out.println(mapaSemana.get("ju"));
        System.out.println("--------------------");
        mapaSemana.forEach((k,v)->System.out.println(k+": "+v));
        
        //Implementacion TreeMap, almacena los elementos en un arbol
        mapaSemana=new TreeMap();
        mapaSemana.put("lu", "lunes");
        mapaSemana.put("ma", "martes");
        mapaSemana.put("mi", "miercoles");
        mapaSemana.put("ju", "jueves");
        mapaSemana.put("vi", "viernes");
        //System.out.println(mapaSemana.get("ju"));
        System.out.println("--------------------");
        mapaSemana.forEach((k,v)->System.out.println(k+": "+v));
        
        //Que diferencia hay entre Hashtable y HashMap
        //La clase Hashtable es menos performante, es safe Thread, es obsoleta
        //HashMap es mas performante no es Safe Thread, es actual.
        
        //Interface Collections para SafeThread (multiprocesos)
        
        //lista safeThread
        List<String>listaString=Collections.synchronizedList(new ArrayList());
        listaString.add("Hola");
        Set<String>listaSet=Collections.synchronizedSet(new HashSet());
        Map<String,String>mapa=Collections.synchronizedMap(new TreeMap());
        
        
        //Enumerados a partir de java
        //son un conjuntos de constantes y ayudan a validar un campo
        EstadoCivil estado=EstadoCivil.CASADO;
        Arrays.asList(EstadoCivil.values()).forEach(System.out::println);
        
        //Enumerados avanzados
        Estado e=Estado.CASADO;
        System.out.println(e.getEstado());
        Arrays.asList(
                Estado
                        .values())
                        .forEach(item->System.out.println(item.getEstado())
                );
        
        //Investigar JSF JSP JPA JTA
        
        
    }
    
}
