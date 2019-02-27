/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author user
 */
public class left_and_right_shift {
    public static void main(String args[]){
        System.out.println("Left Shift");
        
        byte a=64,b;
        int i; 
        
        i=a<<2;
        b=(byte)(a<<2);
        System.out.println("original value of a="+a);
        System.out.println("i and b="+i+" "+b);
        
        System.out.println("Right Shift");
        
        byte c=8,d;
        int j; 
        
        j=c>>2;
        d=(byte)(c>>2);
        System.out.println("original value of c="+c);
        System.out.println("j and d="+j+" "+d);
        
        
    }
}
