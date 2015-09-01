public class Desarrollador_Gen{
  public Desarrollador getType(String type, String nombre){
    if(type == null){
         return null;
      }		
      if(type.equalsIgnoreCase("WEB")){
         return new Desarrollador_Web(nombre);
         
      } else if(type.equalsIgnoreCase("JAVA")){
         return new Desarrollador_Java(nombre);
         
      } else if(type.equalsIgnoreCase("CEL")){
         return new Desarrollador_Cel(nombre);
      }
      
      return null;
   }
  }
