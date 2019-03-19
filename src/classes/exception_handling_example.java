
package classes;

public class exception_handling_example {
    
    static void procA(){
        try{
            System.out.println("Inside ProcA");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("procA's finally");
        }
    }
        
    static void procB(){
        try{
            System.out.println("inside ProcB");
            return;
        }
        finally{
            System.out.println("procB's finally");
        }
    }
    
    static void procC(){
        try{
            System.out.println("inside procC");
        }
        finally{
            System.out.println("procC's finally");
        }
    }
    
    public static void main(String args[]){
        try{
            procA();
        }
        catch (Exception e){
              System.out.println("Exception caught | Exception = "+e);
        }
        procB();
        procC();
    }
}
    

