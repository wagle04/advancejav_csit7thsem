
package classes;
import java.io.*;

public class read_a_text_file {
    public static void main(String args[])
        throws Exception{
        try{
        FileReader fr=new FileReader("G:\\Projects\\java\\advancejava_csit7thsem\\src\\classes\\test.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char) i);
        }
        
    }
        catch (Exception e){
        System.out.println("Error : " +e);
}
    }
    
    }
    

