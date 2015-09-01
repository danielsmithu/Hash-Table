public class Desarrollador_Gen{
  public Desarrollador getType(String type){
    if(type == null){
         return null;
      }		
      if(type.equalsIgnoreCase("WEB")){
         return new Desarrollador_Web();
         
      } else if(type.equalsIgnoreCase("JAVA")){
         return new Desarrollador_Java();
         
      } else if(type.equalsIgnoreCase("CEL")){
         return new Desarrollador_Cel();
      }
      
      return null;
   }
  }
