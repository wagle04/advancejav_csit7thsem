
package classes;

class Cube{
    
    double volume(double l){
        return l*l*l;
    }
    
    int volume(int l){
        return l*l*l;
    }
}
public class method_overloading_example {
    public static void main(String args[]){
        Cube cube1=new Cube();
        Cube cube2=new Cube();
        double l1=1.2;
        int l2=3;
        
        System.out.println("Volume of cube1 is: "+cube1.volume(l1));
        System.out.println("Volume of cube1 is: "+cube2.volume(l2));
    }
}
