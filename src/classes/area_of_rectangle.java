/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.util.Scanner;

class rectangle {
    float length;
    float breadth;

    float area(float l, float b) {
        length = l;
        breadth = b;
        return length * breadth;
    }
}

public class area_of_rectangle {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length:");
        float len = input.nextFloat();
        System.out.println("Enter breadth:");
        float bre = input.nextFloat();

        rectangle rect = new rectangle();
        System.out.println("Area of rectangle= " + rect.area(len, bre));
    }
}
