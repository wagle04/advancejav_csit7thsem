

package classes;

interface Animal{
    public void eats();
    public void walks();
    public void crawls();
}


public class interface_example {
    public static void main(String args[]){
        mammal_interface m1=new mammal_interface();
        reptile_interface r1=new reptile_interface();
        m1.eats();
        m1.walks();
        m1.crawls();
        System.out.println();
        r1.eats();
        r1.walks();
        r1.crawls();
    }
    
}
