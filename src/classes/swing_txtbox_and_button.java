
  
package classes;
  
import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*;  

public class swing_txtbox_and_button extends JFrame 
{ 
    JFrame frame; 
    swing_txtbox_and_button() 
    { 
        setTitle("frame using swing"); 
        
        JTextField txtfield=new JTextField();
        txtfield.setBounds(50, 100, 200, 30); 
        add(txtfield);
        
        JButton button = new JButton("click"); 
        button.setBounds(100, 150, 115, 55); 
        add(button); 
        
        JLabel txtlabel=new JLabel();
        txtlabel.setBounds(135, 175, 200, 50); 
        txtlabel.setVisible(false);
        add(txtlabel);
        
        button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            txtfield.setVisible(false);
            button.setVisible(false);
            txtlabel.setVisible(true);
            txtlabel.setFont(new Font("Serif", Font.PLAIN, 30));
            txtlabel.setText(txtfield.getText());
        }
        });
  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(400, 500); 
        setLayout(null); 
        setVisible(true); 
    } 
      
    public static void main(String[] args) 
    { 
        new swing_txtbox_and_button(); 
    } 
}