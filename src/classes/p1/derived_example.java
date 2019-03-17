
package classes.p1;

public class derived_example extends protection_example{
    derived_example(){
        System.out.println("Derived Constructor");
        System.out.println("n="+n);
        
        //class only
        //System.out.println("n_pri="+n_pri);
        
        System.out.println("n_pro="+n_pro);
        System.out.println("n_pub="+n_pub);
    }
    
}
