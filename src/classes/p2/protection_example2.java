
package classes.p2;

public class protection_example2 extends classes.p1.protection_example{
    protection_example2(){
        System.out.println("Derived other package constructor");
        
        //class or package only
        //System.out.println("n"+n);
        //class only
        //System.out.println("n_pri"+n_pri);
        System.out.println("n_pro="+n_pro);
        System.out.println("n_pub="+n_pub);
        
    }
    
}
