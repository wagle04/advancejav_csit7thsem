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
public class arthimetic_compound_assignment_operators {
    public static void main(String args[]){
        System.out.println("arthimetic compound assignment operators");
        int a=1;
        int b=2;
        int c=3;
        int d=7;
        
        a+=5;
        b*=2;
        c+=a*b;
        d%=5;
        
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        
    }
}
