
package classes;
import javax.swing.*;

public class employee_form_layout {
    public static void main(String args[]){
        JFrame win=new JFrame("Employee Registration");
        win.getContentPane().setLayout(null);
        JLabel lblid=new JLabel("Emp. ID:");
        lblid.setBounds(5,5,50,50);
        JLabel lblname=new JLabel("Emp. Name:");
        lblname.setBounds(5,55,100,50);
        JLabel lblgender=new JLabel("Gender:");
        lblgender.setBounds(5,105,100,50);
        JLabel lblpost=new JLabel("Post:");
        lblpost.setBounds(5,155,100,50);
        JLabel lblsalary=new JLabel("Salary:");
        lblsalary.setBounds(5,205,100,50);
        String posts[]={"Manager","Assistant","Helper"};
        JComboBox combolevel=new JComboBox(posts);
        combolevel.setBounds(105,170,100,25);
        JButton btnok=new JButton("OK");
        btnok.setBounds(5,275,100,50);
        JTextField txtid=new JTextField(5);
        txtid.setBounds(105,20,200,25);
        JTextField txtname=new JTextField(5);
        txtname.setBounds(105,70,200,25);
        JTextField txtpost=new JTextField(5);
        txtpost.setBounds(105,120,200,25);
        JTextField txtsalary=new JTextField(5);
        txtsalary.setBounds(105,220,200,25);
        JRadioButton gendermale=new JRadioButton("Male");
        gendermale.setBounds(105,115,100,25);
        JRadioButton genderfemale=new JRadioButton("Female");
        genderfemale.setBounds(205,115,100,25);
        win.add(lblid);
        win.add(txtid);
        win.add(lblname);
        win.add(txtname);
        win.add(lblgender);
        win.add(gendermale);
        win.add(genderfemale);
        win.add(lblpost);
        win.add(combolevel);
        win.add(lblsalary);
        win.add(txtsalary);
        win.add(btnok);
        
        win.setSize(700,700);
        win.setVisible(true);
    }
}
