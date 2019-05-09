

package classes;

import java.net.*;
import java.io.*;

public class parsing_a_url {
    public static void main(String[] args) throws Exception{
        URL aurl=new URL("http://example.com:80/docs/books/tutorial"+"index.html?name=networking#DOWNLOADING");
        
        System.out.println("protocol= "+aurl.getProtocol());
        System.out.println("authority= "+aurl.getAuthority());
        System.out.println("host= "+aurl.getHost());
        System.out.println("port= "+aurl.getPort());
        System.out.println("path= "+aurl.getPath());
        System.out.println("query= "+aurl.getQuery());
        System.out.println("filename= "+aurl.getFile());
        System.out.println("ref= "+aurl.getRef());
        
    }
}
