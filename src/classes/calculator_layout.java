
package classes;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.FlowLayout;
public class calculator_layout {
        
    static JTextField txtf1;
    public static void main(String args[]){
        JFrame win=new JFrame("Calculator");    
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(150,300);
        //win.getContentPane().setPreferredSize(new Dimension(300,300));
        win.getContentPane().setLayout(new FlowLayout());
        txtf1=new JTextField(" ",10);
        win.getContentPane().add(txtf1);
        
        for (int i=0;i<10;i++){
            win.getContentPane().add(
            new JButton(String.valueOf(i)));
        }
        win.getContentPane().add(new JButton("+"));
        win.getContentPane().add(new JButton("-"));
        win.getContentPane().add(new JButton("*"));
        win.getContentPane().add(new JButton("/"));
        win.getContentPane().add(new JButton("="));
        
        //win.pack();
        win.setVisible(true);
        
    }
}
