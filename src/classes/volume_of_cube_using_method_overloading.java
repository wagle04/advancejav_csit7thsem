

package classes;

class cube{
    double length;
    
    cube(){
       length=0;
    }
    
    double volume(){
        return length*length*length;
    }
    
    double volume(double l){
        return l*l*l;
    }
}
public class volume_of_cube_using_method_overloading {
    public static void main(String args[]){
        cube c1=new cube();
        cube c2=new cube();
        System.out.println("Volume of cube1 is:"+c1.volume());
        System.out.println("Volume of cube2 is:"+c2.volume(5));
        
        
    }
    
}
