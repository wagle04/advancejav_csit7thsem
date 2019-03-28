
package classes;
import javax.swing.JOptionPane;
public class addition_using_gui_example {
    public static void main(String[] args){
        String num1=JOptionPane.showInputDialog("Enter first integer");
        String num2=JOptionPane.showInputDialog("Enter second integer");
        
        int number1=Integer.parseInt(num1);
        int number2=Integer.parseInt(num2);
        int sum=number1+number2;    
        
        JOptionPane.showMessageDialog(null,"The sum is "+sum,"Sum of two integers",JOptionPane.PLAIN_MESSAGE);
    }
}
