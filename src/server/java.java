

package server;

import java.io.*;
import java.net.*;

public class java {
    public static void main(String a[]) throws IOException{
        try{
            System.out.println("Server.....\n");
            ServerSocket s = new ServerSocket(95);
            System.out.println("Server waiting for client");
            Socket cs=s.accept();
            InetAddress ia=cs.getInetAddress();
            String cli=ia.getHostAddress();
            System.out.println("Connected to client with IP:"+cli);
            BufferedReader in =new BufferedReader(new
            InputStreamReader(cs.getInputStream()));
            PrintWriter out=new PrintWriter(cs.getOutputStream(),true);
            
            do{
                BufferedReader din=new BufferedReader(new
                InputStreamReader(System.in));
                System.out.print("To Client:");
                String tocl=din.readLine();
                out.println(tocl);
                String st = in.readLine();
                if(st.equalsIgnoreCase("Bye")||st==null)break;
                System.out.println("From Client:"+st);
                
            }while(true);
            in.close();
            out.close();
            cs.close();
        }
        catch(IOException e){
            
        }
    }
}
