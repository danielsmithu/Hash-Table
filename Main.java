import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;
public class main_set{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    //Desarrollador_Gen desarrollador_Gen = new Desarrollador_Gen();
    
    boolean programadores = true;
    boolean isProgramador_Java;
    boolean isProgramador_Web;
    boolean isProgramador_Cel;
    String programador_Lectura;
	  HashSet<String> nombres_Programadores_Java_Hash = new HashSet<>();
    HashSet<String> nombres_Programadores_Web_Hash HashSet<>();
    HashSet<String> nombres_Programadores_Cel_Hash = new HashSet<>();
    HashSet<String> union_Java_Web_Cel_Hash = new HashSet<>();
    HashSet<String> union_Java_Hash = new HashSet<>();
    HashSet<String> union_Web_Cel_Hash = new HashSet<>();
    HashSet<String> union_Web_o_Cel_Hash = new HashSet<>();
    HashSet<String> mayor_Hash = new HashSet<>();
    
    TreeSet<Integer> nombres_Programadores_Java_Tree = new TreeSet<Integer>();
    TreeSet<Integer> nombres_Programadores_Web_Tree = new TreeSet<Integer>();
    TreeSet<Integer> nombres_Programadores_Cel_Tree = new TreeSet<Integer>();
    TreeSet<Integer> union_Java_Web_Cel_Tree = new TreeSet<Integer>();
    TreeSet<Integer> union_Java_Tree = new TreeSet<Integer>();
    TreeSet<Integer> union_Web_Cel_Tree = new TreeSet<Integer>();
    TreeSet<Integer> union_Web_o_Cel_Tree = new TreeSet<Integer>();
    TreeSet<Integer> mayor_Tree = new TreeSet<Integer>();
    
    LinkedHashSet nombres_Programadores_Java_Lk = new LinkedHashSet();
    LinkedHashSet nombres_Programadores_Web_Lk = new LinkedHashSet();
    LinkedHashSet nombres_Programadores_Cel_Lk = new LinkedHashSet();
    LinkedHashSet union_Java_Web_Cel_Lk = new LinkedHashSet();
    LinkedHashSet union_Java_Lk = new LinkedHashSet();
    LinkedHashSet union_Web_Cel_Lk = new LinkedHashSet();
    LinkedHashSet union_Web_o_Cel_Lk = new LinkedHashSet();
    LinkedHashSet mayor_Lk = new LinkedHashSet();
	
  	Desarrollador desarrollador_Java;
	  Desarrollador desarrollador_Web;
	  Desarrollador desarrollador_Cel;
	  
    
    System.out.println("Bienvenido, por favor elija la implementacion que desea utilizar");
    System.out.println("Escriba el numero de la implementacion");
    System.out.println("1. HashSet");
    System.out.println("2. TreeSet");
    System.out.println("3. LinkedHashSet");
    
    String implementacion = lectura.nextLine();
    String nombre_Implementacion = "";
    if (implementacion.equals("1")){
      nombre_Implementacion = "HashSet";
    }
    else if (implementacion.equals("2")){
      nombre_Implementacion = "TreeSet";
    }
    else if (implementacion.equals("3")){
      nombre_Implementacion = "LinkedHashSet";
    }
    
    System.out.println("Usted ha elejido " + nombre_Implementacion);
    
    while (programadores){
      System.out.println("Ingrese el nombre del programador");
      System.out.println("Para finalizar escriba null");
      String programador = lectura.nextLine();
      if (programador.equals("null")){
        programadores = false;
      }
      else{
        System.out.println("Es programador Java? s/n");
        programador_Lectura = lectura.nextLine();
        if (programador_Lectura.toUpperCase().equals("S")){
          isProgramador_Java = true;
        }
        else{
          isProgramador_Java = false;
        }
        
        System.out.println("Es programador Web? s/n");
        programador_Lectura = lectura.nextLine();
        if (programador_Lectura.toUpperCase().equals("S")){
          isProgramador_Web = true;
        }
        else{
          isProgramador_Web = false;
        }
        
        System.out.println("Es programador de Celular? s/n");
        programador_Lectura = lectura.nextLine();
        if (programador_Lectura.toUpperCase().equals("S")){
          isProgramador_Cel = true;
        }
        else{
          isProgramador_Cel = false;
        }
        
        if(isProgramador_Java){
          desarrollador_Java = desarrollador_Gen("JAVA", programador);
          if(nombre_Implementacion.equals("HashSet")){
            nombres_Programadores_Java_Hash.add(desarrollador_Java.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            nombres_Programadores_Java_Tree.add(desarrollador_Java.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            nombres_Programadores_Java_Lk.add(desarrollador_Java.nuevo_desarrollador());
          }
        }
        if(isProgramador_Web){
          desarrollador_Web = desarrollador_Gen("WEB", programador);
          if(nombre_Implementacion.equals("HashSet")){
            nombres_Programadores_Web_Hash.add(desarrollador_Web.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            nombres_Programadores_Web_Tree.add(desarrollador_Web.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            nombres_Programadores_Web_Lk.add(desarrollador_Web.nuevo_desarrollador());
          }
        }
        if(isProgramador_Cel){
          desarrollador_Cel = desarrollador_Gen("CEL", programador);
          if(nombre_Implementacion.equals("HashSet")){
            nombres_Programadores_Cel_Hash.add(desarrollador_Cel.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            nombres_Programadores_Cel_Tree.add(desarrollador_Cel.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            nombres_Programadores_Cel_Lk.add(desarrollador_Cel.nuevo_desarrollador());
          }
        }
        
        if(isProgramador_Java && isProgramador_Web && isProgramador_Cel){
          if(nombre_Implementacion.equals("HashSet")){
            union_Java_Web_Cel_Hash.add(desarrollador_Java.nuevo_desarrollador());
            union_Java_Web_Cel_Hash.add(desarrollador_Web.nuevo_desarrollador());
            union_Java_Web_Cel_Hash.add(desarrollador_Cel.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            union_Java_Web_Cel_Tree.add(desarrollador_Java.nuevo_desarrollador());
            union_Java_Web_Cel_Tree.add(desarrollador_Web.nuevo_desarrollador());
            union_Java_Web_Cel_Tree.add(desarrollador_Cel.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            union_Java_Web_Cel_Lk.add(desarrollador_Java.nuevo_desarrollador());
            union_Java_Web_Cel_Lk.add(desarrollador_Web.nuevo_desarrollador());
            union_Java_Web_Cel_Lk.add(desarrollador_Cel.nuevo_desarrollador());
          }
        }
        
        if(isProgramador_Java && (isProgramador_Web==false)){
          if(nombre_Implementacion.equals("HashSet")){
            union_Java_Hash.add(desarrollador_Java.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            union_Java_Tree.add(desarrollador_Java.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            union_Java_Lk.add(desarrollador_Java.nuevo_desarrollador());
          }
        }
        
        if(isPogramador_Web && isProgramador_Cel){
          if(nombre_Implementacion.equals("HashSet")){
            union_Web_Cel_Hash.add(desarrollador_Web.nuevo_desarrollador());
            union_Web_Cel_Hash.add(desarrollador_Cel.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            union_Web_Cel_Tree.add(desarrollador_Web.nuevo_desarrollador());
            union_Web_Cel_Tree.add(desarrollador_Cel.nuevo_desarrollador());
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            union_Web_Cel_Lk.add(desarrollador_Web.nuevo_desarrollador());
            union_Web_Cel_Lk.add(desarrollador_Cel.nuevo_desarrollador());
          }
        }
        
        if((isProgramador_Web || isProgramador_Cel) && (isProgramador_Java==false)){
          if(nombre_Implementacion.equals("HashSet")){
            union_Web_o_Cel_Hash.add(programador);
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            union_Web_o_Cel_Tree.add(programador);
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            union_Web_o_Cel_Lk.add(programador);
          }
        }
        
      }
    }
    System.out.println("Desarrolladores Java, Web y de Celulares (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Java_Web_Cel_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Java_Web_Cel_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Java_Web_Cel_Lk);
    }
    
    System.out.println("Desarrolladores de Java sin experiencia Web (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Java_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Java_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Java_Lk);
    }
    
    System.out.println("Desarrolladores Web y de Celulares sin experiencia Java (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Web_Cel_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Web_Cel_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Web_Cel_Lk);
    }
    
    System.out.println("Desarrolladores Web o de Celulares (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Web_o_Cel_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Web_o_Cel_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Web_o_Cel_Lk);
    }
    
    System.out.println("Los desarrolladores Java es un subconjunto de desarrolladores Web?");
    
    String conjunto_Mayor;
    if(nombre_Implementacion.equals("HashSet")){
      if(nombres_Programadores_Java_Hash.size() > nombres_Programadores_Web_Hash.size()){
        if(nombres_Programadores_Java_Hash.size() > nombres_Programadores_Cel_Hash.size()){
          conjunto_Mayor = "Java";
          mayor_Hash = nombres_Programadores_Java_Hash;
        }
        else{
          conjunto_Mayor = "de Celulares";
          mayor_Hash = nombres_Programadores_Cel_Hash;
        }
      }
      else{
        if(nombres_Programadores_Web_Hash.size() > nombres_Programadores_Cel_Hash.size()){
          conjunto_Mayor = "Web";
          mayor_Hash = nombres_Programadores_Web_Hash;
        }
        else{
          conjunto_Mayor = "de Celulares";
          mayor_Hash = nombres_Programadores_Cel_Hash;
        }
      }
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      if(nombres_Programadores_Java_Tree.size() > nombres_Programadores_Web_Tree.size()){
        if(nombres_Programadores_Java_Tree.size() > nombres_Programadores_Cel_Tree.size()){
          conjunto_Mayor = "Java";
          mayor_Tree = nombres_Programadores_Java_Tree;
        }
        else{
          conjunto_Mayor = "de Celulares";
          mayor_Tree = nombres_Programadores_Cel_Tree;
        }
      }
      else{
        if(nombres_Programadores_Web_Tree.size() > nombres_Programadores_Cel_Tree.size()){
          conjunto_Mayor = "Web";
          mayor_Tree = nombres_Programadores_Web_Tree;
        }
        else{
          conjunto_Mayor = "de Celulares";
          mayor_Tree = nombres_Programadores_Cel_Tree;
        }
      }
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      if(nombres_Programadores_Java_Lk.size() > nombres_Programadores_Web_Lk.size()){
        if(nombres_Programadores_Java_Lk.size() > nombres_Programadores_Cel_Lk.size()){
          conjunto_Mayor = "Java";
          mayor_Lk = nombres_Programadores_Java_Lk;
        }
        else{
          conjunto_Mayor = "de Celulares";
          mayor_Lk = nombres_Programadores_Cel_Lk;
        }
      }
      else{
        if(nombres_Programadores_Web_Lk.size() > nombres_Programadores_Cel_Lk.size()){
          conjunto_Mayor = "Web";
          mayor_Lk = nombres_Programadores_Web_Lk;
        }
        else{
          conjunto_Mayor = "de Celulares";
          mayor_Lk = nombres_Programadores_Cel_Lk;
        }
      }
    }
    System.out.println("El conjunto mas grande es el de desarrolladores " + conjunto_Mayor);
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(mayor_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(mayor_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(mayor_Lk);
    }
    
    System.out.println("La lista ordenada:");
    
  }
}
