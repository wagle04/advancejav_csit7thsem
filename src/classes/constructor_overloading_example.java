

package classes;


class Concat{
    int isum;
    String ssum;
    
    Concat(int a, int b){
        isum=a+b;
    }
    
    Concat(String a, String b){
        ssum=a+b;
    }
    
}
public class constructor_overloading_example {
    public static void main(String args[]){
        Concat intsum=new Concat(3,4);
        Concat stringsum=new Concat("hello ","world");
        
        System.out.println("Integer sum is: "+intsum.isum);
        System.out.println("String sum is: "+stringsum.ssum);
    }
    
}
