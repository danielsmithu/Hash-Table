import java.util.Scanner;
import java.util.*;
import java.util.stream.*;
public class Main{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    Desarrollador_Gen desarrollador_Gen = new Desarrollador_Gen();
    
    boolean programadores = true;
    boolean isProgramador_Java;
    boolean isProgramador_Web;
    boolean isProgramador_Cel;
    String programador_Lectura;
    ArrayList<String> nombres_Programadores_Java = new ArrayList<String>();
    ArrayList<String> nombres_Programadores_Web = new ArrayList<String>();
    ArrayList<String> nombres_Programadores_Cel = new ArrayList<String>();
    
    System.out.println("Bienvenido, por favor elija la implementacion que desea utilizar");
    System.out.println("Escriba el numero de la implementacion")
    System.out.println("1. HashSet")
    System.out.println("2. TreeSet")
    System.out.println("3. LinkedHashSet")
    
    String implementacion = lectura.nextLine();
    if (implementacion ==  "1"){
      Collection<Type> hash = new HashSet<Type>(c);
    }
    else if (implementacion == "2"){
      
    }
    else if (implementacion == "3"){
      
    }
    
    while (programadores){
      System.out.println("Ingrese el nombre del programador");
      System.out.println("Para finalizar escriba null");
      String programador = lectura.nextLine();
      if (programador == "null"){
        programadores = false;
      }
      else{
        System.out.println("Es programador Java? s/n");
        programador_Lectura = lectura.nextLine();
        if (programador_Lectura.toUpperCase() == "S"){
          isProgramador_Java = true;
        }
        else{
          isProgramador_Java = false;
        }
        
        System.out.println("Es programador Web? s/n");
        programador_Lectura = lectura.nextLine();
        if (programador_Lectura.toUpperCase() == "S"){
          isProgramador_Web = true;
        }
        else{
          isProgramador_Web = false;
        }
        
        System.out.println("Es programador de Celular? s/n");
        programador_Lectura = lectura.nextLine();
        if (programador_Lectura.toUpperCase() == "S"){
          isProgramador_Cel = true;
        }
        else{
          isProgramador_Cel = false;
        }
        
        if(isProgramador_Java){
          nombres_Programadores_Java.add(programador);
        }
        if(isProgramador_Web){
          nombres_Programadores_Web.add(programador);
        }
        if(isProgramador_Cel){
          nombres_Programadores_Cel.add(programador);
        }
      }
    }
    
  }
}
