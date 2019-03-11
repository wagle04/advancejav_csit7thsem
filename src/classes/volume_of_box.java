

package classes;

class Box{
    double width;
    double height;
    double depth;
    
    Box(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    
    double volume(){
        return width*height*depth;
    }
}
public class volume_of_box {
    public static void main(String args[]){
        Box box1=new Box(10,20,15);
        Box box2=new Box(3,6,9);
        
        /*box1.width=10;
        box1.height=20;
        box1.depth=15;
        
        box2.width=3;
        box2.height=6;
        box2.depth=9;*/
        
        System.out.println("Volume of box1 is:"+box1.volume());
        System.out.println("Volume of box2 is:"+box2.volume());
        
        
    }
    
}
