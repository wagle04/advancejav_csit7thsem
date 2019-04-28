
package classes;
import java.awt.FlowLayout;
import javax.swing.*;

public class student_form_layout {
    public static void main(String args[]){
        JFrame win=new JFrame("Student Registration");
        win.getContentPane().setLayout(null);
        JLabel namel=new JLabel("Name:");
        namel.setBounds(5,5,50,50);
        JLabel addressl=new JLabel("Address:");
        addressl.setBounds(5,55,100,50);
        JLabel rolll=new JLabel("Roll No:");
        rolll.setBounds(5,105,100,50);
        JLabel genderl=new JLabel("Gender:");
        genderl.setBounds(5,155,100,50);
        JLabel levell=new JLabel("Level:");
        levell.setBounds(5,205,100,50);
        String levels[]={"Bachelor","Master","PhD."};
        JComboBox combolevel=new JComboBox(levels);
        combolevel.setBounds(105,220,100,25);
        JButton btnsubmit=new JButton("Submit");
        btnsubmit.setBounds(5,275,100,50);
        JTextField txtn=new JTextField(5);
        txtn.setBounds(105,20,200,25);
        JTextField txta=new JTextField(5);
        txta.setBounds(105,70,200,25);
        JTextField txtr=new JTextField(5);
        txtr.setBounds(105,120,200,25);
        JRadioButton gendermale=new JRadioButton("Male");
        gendermale.setBounds(105,170,100,25);
        JRadioButton genderfemale=new JRadioButton("Female");
        genderfemale.setBounds(205,170,100,25);
        win.add(namel);
        win.add(txtn);
        win.add(addressl);
        win.add(txta);
        win.add(rolll);
        win.add(txtr);
        win.add(genderl);
        win.add(gendermale);
        win.add(genderfemale);
        win.add(levell);
        win.add(combolevel);
        win.add(btnsubmit);
        
        win.setSize(700,700);
        win.setVisible(true);
    }
}
