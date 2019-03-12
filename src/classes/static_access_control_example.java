

package classes;

class square{
    static double length=5;
    
    static double value(){
        return length*length;
    }
}
public class static_access_control_example {
    public static void main(String args[]){
        //printing value for area of square without initializing object of class square
        System.out.println("Area of deafult square= "+square.value());
    }
}
