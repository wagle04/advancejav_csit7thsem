

package client;

import java.io.*;
import java.net.*;

public class java {
    public static void main (String a[]) throws IOException{
        try{
            System.out.println("Client.....\n");
            Socket con =new Socket("localHost",95);
            BufferedReader in=new BufferedReader(new
            InputStreamReader(con.getInputStream()));
            PrintWriter out=new PrintWriter(con.getOutputStream(),true);
            
            while(true){
                String s1=in.readLine();
                System.out.println("From Server : "+s1);
                System.out.print("Enter message to server:");
                BufferedReader din=new BufferedReader(new
                InputStreamReader(System.in));
                String st=din.readLine();
                out.println(st);
                if(st.equalsIgnoreCase("Bye")||st==null)break;
            }
            in.close();
            out.close();
            con.close();
        }
        catch(UnknownHostException e){
            
        }
    }
}
