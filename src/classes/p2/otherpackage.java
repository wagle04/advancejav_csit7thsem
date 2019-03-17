

package classes.p2;

class otherpackage {
    otherpackage(){
        classes.p1.protection_example p=new classes.p1.protection_example();
        System.out.println("Other package constructor");
        
        //class or package only
        //System.out.println("n_pro="+p.n);
        
        //class only
        //System.out.println("n_pub="+p.n_pri);
        
        //class, subclass or package only
        //System.out.println("n_pro="+p.n_pro);
        
        System.out.println("n_pub="+p.n_pub);
    }
    
}
