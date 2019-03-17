

package classes.p1;

class samepackage {
    samepackage(){
        protection_example p=new protection_example();
        System.out.println("Same Package Constructor");
        System.out.println("n="+p.n);
        
        System.out.println("n_pro="+p.n_pro);
        System.out.println("n_pub="+p.n_pub);
        //class only
        //System.out.println("n_pri="+p.n_pri);
    }
    
}
