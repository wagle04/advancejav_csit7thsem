
package classes;
import java.io.*;

public class copy_text_file {
    public static void main(String args[]){
        
        try{
        FileReader fr=new FileReader("G:\\Projects\\java\\advancejava_csit7thsem\\src\\classes\\test.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("G:\\Projects\\java\\advancejava_csit7thsem\\src\\classes\\test1.txt");
        String s;
        
        while((s=br.readLine())!=null){
            fw.write(s);
            fw.flush();
        }
        
        br.close();
        fw.close();
        System.out.println("File Copied");
        
        }
        catch(IOException e){
            System.out.println("Error ! "+e);
    }
        
   }
}
