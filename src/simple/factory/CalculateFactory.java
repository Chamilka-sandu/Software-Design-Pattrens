
package simple.factory;


public class CalculateFactory {
    
    public Calculate getcalculate(String type){
    
      Calculate obj = null ;
        if (type.equals("Add")){
     obj = new Add();}
  
      else if (type.equals("sub")){
     obj = new Substract();} 
       
       else if (type.equals("Devide")){
     obj = new Devide();} 
        return obj;
    }
    
   
}
