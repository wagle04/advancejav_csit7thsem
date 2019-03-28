package classes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class SimpleFrame1 extends JFrame{
    public SimpleFrame1(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
    public static final int DEFAULT_WIDTH=400;
    public static final int DEFAULT_HEIGHT=400;
}


public class multiplication_using_jframe {

    public static void main(String[] args) {
        // TODO code application logic here
        SimpleFrame frame= new SimpleFrame();
        
        JTextField t1,t2,t3;  
        
        t1=new JTextField("enter number 1");  
        t1.setBounds(50,100, 200,30);  
        
        t2=new JTextField("Enter number 2");  
        t2.setBounds(50,150, 200,30);  
        
        t3=new JTextField("");  
        t3.setBounds(50,200, 200,30);  
        
        frame.add(t1); 
        frame.add(t2);
        
     
        JButton b = new JButton("Multiply");
        b.setBounds(50,250,90, 40);
        frame.add(b);
        frame.add(t3);
       
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int d=Integer.parseInt(t2.getText());

                System.out.println(a);
                System.out.println(d);
                t3.setText(String.valueOf(a*d));
            }
        });
        
        
        
    }
    
}

