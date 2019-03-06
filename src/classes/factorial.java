/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Scanner;


class fact{
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
public class factorial {
    
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = input.nextInt();
    
    fact fact1=new fact();
    double factvalue=fact1.value(num);
    System.out.println("Factorial of "+num+" is "+factvalue);
    }
}
