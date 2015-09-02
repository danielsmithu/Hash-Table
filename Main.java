import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;
public class Main{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    Desarrollador_Gen desarrollador_gen = new Desarrollador_Gen();
    
    boolean programadores = true;
    boolean isProgramador_Java;
    boolean isProgramador_Web;
    boolean isProgramador_Cel;
    String programador_Lectura;
	  HashSet<String> nombres_Programadores_Java_Hash = new HashSet<>();
    HashSet<String> nombres_Programadores_Web_Hash = new HashSet<>();
    HashSet<String> nombres_Programadores_Cel_Hash = new HashSet<>();
    HashSet<String> union_Java_Web_Cel_Hash = new HashSet<>();
    HashSet<String> union_Java_Hash = new HashSet<>();
    HashSet<String> union_Web_Cel_Hash = new HashSet<>();
    HashSet<String> union_Web_o_Cel_Hash = new HashSet<>();
    HashSet<String> mayor_Hash = new HashSet<>();
    
    TreeSet<String> nombres_Programadores_Java_Tree = new TreeSet<String>();
    TreeSet<String> nombres_Programadores_Web_Tree = new TreeSet<String>();
    TreeSet<String> nombres_Programadores_Cel_Tree = new TreeSet<String>();
    TreeSet<String> union_Java_Web_Cel_Tree = new TreeSet<String>();
    TreeSet<String> union_Java_Tree = new TreeSet<String>();
    TreeSet<String> union_Web_Cel_Tree = new TreeSet<String>();
    TreeSet<String> union_Web_o_Cel_Tree = new TreeSet<String>();
    TreeSet<String> mayor_Tree = new TreeSet<String>();
    
    LinkedHashSet<String> nombres_Programadores_Java_Lk = new LinkedHashSet<String>();
    LinkedHashSet<String> nombres_Programadores_Web_Lk = new LinkedHashSet<String>();
    LinkedHashSet<String> nombres_Programadores_Cel_Lk = new LinkedHashSet<String>();
    LinkedHashSet<String> union_Java_Web_Cel_Lk = new LinkedHashSet<String>();
    LinkedHashSet<String> union_Java_Lk = new LinkedHashSet<String>();
    LinkedHashSet<String> union_Web_Cel_Lk = new LinkedHashSet<String>();
    LinkedHashSet<String> union_Web_o_Cel_Lk = new LinkedHashSet<String>();
    LinkedHashSet<String> mayor_Lk = new LinkedHashSet<String>();
	
  	Desarrollador desarrollador_Java = desarrollador_gen.getType("JAVA");
	Desarrollador desarrollador_Web = desarrollador_gen.getType("WEB");
	Desarrollador desarrollador_Cel = desarrollador_gen.getType("CEL");
	  
    
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
          if(nombre_Implementacion.equals("HashSet")){
            nombres_Programadores_Java_Hash.add(desarrollador_Java.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            nombres_Programadores_Java_Tree.add(desarrollador_Java.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            nombres_Programadores_Java_Lk.add(desarrollador_Java.nuevo_desarrollador(programador));
          }
        }
        if(isProgramador_Web){
          if(nombre_Implementacion.equals("HashSet")){
            nombres_Programadores_Web_Hash.add(desarrollador_Web.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            nombres_Programadores_Web_Tree.add(desarrollador_Web.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            nombres_Programadores_Web_Lk.add(desarrollador_Web.nuevo_desarrollador(programador));
          }
        }
        if(isProgramador_Cel){
          if(nombre_Implementacion.equals("HashSet")){
            nombres_Programadores_Cel_Hash.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            nombres_Programadores_Cel_Tree.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            nombres_Programadores_Cel_Lk.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
        }
        
        if(isProgramador_Java && isProgramador_Web && isProgramador_Cel){
          if(nombre_Implementacion.equals("HashSet")){
            union_Java_Web_Cel_Hash.add(desarrollador_Java.nuevo_desarrollador(programador));
            union_Java_Web_Cel_Hash.add(desarrollador_Web.nuevo_desarrollador(programador));
            union_Java_Web_Cel_Hash.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            union_Java_Web_Cel_Tree.add(desarrollador_Java.nuevo_desarrollador(programador));
            union_Java_Web_Cel_Tree.add(desarrollador_Web.nuevo_desarrollador(programador));
            union_Java_Web_Cel_Tree.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            union_Java_Web_Cel_Lk.add(desarrollador_Java.nuevo_desarrollador(programador));
            union_Java_Web_Cel_Lk.add(desarrollador_Web.nuevo_desarrollador(programador));
            union_Java_Web_Cel_Lk.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
        }
        
        if(isProgramador_Java && (isProgramador_Web==false)){
          if(nombre_Implementacion.equals("HashSet")){
            union_Java_Hash.add(desarrollador_Java.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            union_Java_Tree.add(desarrollador_Java.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            union_Java_Lk.add(desarrollador_Java.nuevo_desarrollador(programador));
          }
        }
        
        if(isProgramador_Web && isProgramador_Cel && (isProgramador_Java == false)){
          if(nombre_Implementacion.equals("HashSet")){
            union_Web_Cel_Hash.add(desarrollador_Web.nuevo_desarrollador(programador));
            union_Web_Cel_Hash.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("TreeSet")){
            union_Web_Cel_Tree.add(desarrollador_Web.nuevo_desarrollador(programador));
            union_Web_Cel_Tree.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
          else if(nombre_Implementacion.equals("LinkedHashSet")){
            union_Web_Cel_Lk.add(desarrollador_Web.nuevo_desarrollador(programador));
            union_Web_Cel_Lk.add(desarrollador_Cel.nuevo_desarrollador(programador));
          }
        }
        
        if(((isProgramador_Web && (isProgramador_Cel == false)) || (isProgramador_Cel && (isProgramador_Web == false))) && (isProgramador_Java==false)){
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
    System.out.println("\nDesarrolladores Java, Web y de Celulares (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Java_Web_Cel_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Java_Web_Cel_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Java_Web_Cel_Lk);
    }
    
    System.out.println("\nDesarrolladores de Java sin experiencia Web (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Java_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Java_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Java_Lk);
    }
    
    System.out.println("\nDesarrolladores Web y de Celulares sin experiencia Java (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Web_Cel_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Web_Cel_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Web_Cel_Lk);
    }
    
    System.out.println("\nDesarrolladores Web o de Celulares (" + nombre_Implementacion + "): ");
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(union_Web_o_Cel_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(union_Web_o_Cel_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(union_Web_o_Cel_Lk);
    }
    
    System.out.println("\nLos desarrolladores Java es un subconjunto de desarrolladores Web?");
    if(nombre_Implementacion.equals("HashSet")){
    	int comparacion = 0;
    	if (!nombres_Programadores_Web_Hash.containsAll(nombres_Programadores_Java_Hash)){
    		comparacion = nombres_Programadores_Java_Hash.size();
    	}
    	if(comparacion == nombres_Programadores_Java_Hash.size()){
    		System.out.println("Todos los desarrolladores java son desarrolladores web, si es un subconjunto");
    	}
    	else{
    		System.out.println("No todos los desarrolladores java son desarrolladores web, no es un subconjunto");
    	}
    }
    if(nombre_Implementacion.equals("TreeSet")){
    	int comparacion = 0;
    	if (!nombres_Programadores_Web_Tree.containsAll(nombres_Programadores_Java_Tree)){
    		comparacion = nombres_Programadores_Java_Tree.size();
    	}
    	if(comparacion == nombres_Programadores_Java_Tree.size()){
    		System.out.println("Todos los desarrolladores java son desarrolladores web, si es un subconjunto");
    	}
    	else{
    		System.out.println("No todos los desarrolladores java son desarrolladores web, no es un subconjunto");
    	}
    }
    if(nombre_Implementacion.equals("LinkedHashSet")){
    	int comparacion = 0;
    	if (!nombres_Programadores_Web_Lk.containsAll(nombres_Programadores_Java_Lk)){
    		comparacion = nombres_Programadores_Java_Lk.size();
    	}
    	if(comparacion == nombres_Programadores_Java_Lk.size()){
    		System.out.println("Todos los desarrolladores java son desarrolladores web, si es un subconjunto");
    	}
    	else{
    		System.out.println("No todos los desarrolladores java son desarrolladores web, no es un subconjunto");
    	}
    }
    
    String conjunto_Mayor = "";
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
    System.out.println("\nEl conjunto mas grande es el de desarrolladores " + conjunto_Mayor);
    if(nombre_Implementacion.equals("HashSet")){
      System.out.println(mayor_Hash);
    }
    else if(nombre_Implementacion.equals("TreeSet")){
      System.out.println(mayor_Tree);
    }
    else if(nombre_Implementacion.equals("LinkedHashSet")){
      System.out.println(mayor_Lk);
    }
    
    System.out.println("\nLa lista ordenada:");
    
  }
}
