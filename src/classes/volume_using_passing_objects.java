

package classes;

class box{
    double length;
    
    box(){
        length=-1;
    }
    box(double l){
        length=l;
    }
    
    box(box ob){
        length=ob.length;
    }
    
    double value(){
        return length*length*length;
    }
    
    double value(double l){
        return l*l*l;
    }
}
class cylinder{
    double radius;
    double height;
    
    cylinder(){
        radius=-1;
        height=-1;
    }
    cylinder(double r,double l){
        radius=r;
        height=l;
    }
    cylinder(cylinder ob){
        radius=ob.radius;
        height=ob.height;
    }
    double value(){
        return 3.14*radius*radius*height;
    }
}
public class volume_using_passing_objects {
    public static void main(String args[]){
        box box1=new box(5);
        box clonebox=new box(box1);
        
        System.out.println("Volume of original cube is: "+box1.value());
        System.out.println("Volume of clone cube is: "+clonebox.value());
        
        cylinder cy=new cylinder(2,20);
        cylinder cyclone = new cylinder(cy);
        
        System.out.println("Volume of original cylinder is: "+cy.value());
        System.out.println("Volume of clone cylinder is: "+cyclone.value());
        
        
    }
}
