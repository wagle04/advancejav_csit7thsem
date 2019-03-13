

package classes;

class circle{
    final double PI=3.14159; //using final keyword
    double radius;
    
    circle(){
        radius=-1;
    }
    
    circle(double r){
        this.radius=r; //using this keyword
    }
    
    double circumference(){
        return 2*PI*radius;
    }
}
public class circumference_of_circle {
    public static void main(String args[]){
        
        circle c1=new circle(2.5);
        System.out.println("Circumference of circle with radius "+c1.radius+" is "+c1.circumference());
        
    }
}
