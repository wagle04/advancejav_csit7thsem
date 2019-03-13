
package classes;

class rect{
    double length;
    double breadth;
    
    rect(){
        length=-1;
        breadth=-1;
    }
    rect(double l,double b ){
        this.length=l;
        this.breadth=b;
    }
    
    double calculate_area(){
        return length*breadth;
    }
}

class cuboid extends rect{
    
    double height;
    
    cuboid(double l,double b,double h){
        super(l,b);
        this.height=h;
    }
    
    double calculate_volume(){
        return length*height*breadth;
    }
}
public class inhertinace_using_super {
    public static void main(String args[]){
        
        rect rectangle1=new rect(10,5);
        cuboid cuboid1=new cuboid(10,5,2);
        
        System.out.println("For a rectangle: ");
        System.out.println("Length= "+rectangle1.length+" , Breadth= "+rectangle1.breadth);
        System.out.println("Area= "+rectangle1.calculate_area());
        
        System.out.println("For a cuboid: ");
        System.out.println("Length= "+cuboid1.length+" , Breadth= "+cuboid1.breadth+" , Height= "+cuboid1.height);
        System.out.println("Volume= "+cuboid1.calculate_volume());
        
    }
}
