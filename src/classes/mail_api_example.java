
package classes;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail_api_example {
    public static void main(String[] args){
        final String username = "waglemanish28@gmail.com";
        final String password = "i-am-not-dumb-to-put-gmail-password-in-java-program";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        
        Session session = Session.getInstance(props,new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username,password);
            }
        });
        
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("waglemanish28@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("waglemanish28@gmail.com"));
            message.setSubject("Testing Subject");
            message.setText("This mail is sent using java mail API!!");
            Transport.send(message);
            
            System.out.println("Your email has been sent successfully");
            
            
    }
        catch(MessagingException e){
            throw new RuntimeException(e);
        }
}
}
