
package classes;

public class exception_handling_assignment {
    static void divide(double a,double b) throws ArithmeticException{
        System.out.println("Division : "+a+"/"+b);
        try{
            double result;
            if(b==0)
                throw new ArithmeticException("division by zero");
            else 
                result=a/b;
                System.out.println("Result = "+result);
        }
        catch(Exception e){
            System.out.println("Exception = "+e);
        }
        finally{
            System.out.println("Handled");
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        divide(10,0);
        divide(25,5);
    }
}
