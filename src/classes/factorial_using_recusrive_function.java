
package classes;
import java.util.Scanner;


class factr{
    int num;
    double value(int num){
        if (num>=1){
            return num*value(num-1);
        }
        else{
            return 1;
    }
    }
}
 class factorial_using_recursive_function {
    
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = input.nextInt();
    
    factr fact1=new factr();
    double factvalue=fact1.value(num);
    System.out.println("Factorial of "+num+" = "+factvalue);
    }
}
