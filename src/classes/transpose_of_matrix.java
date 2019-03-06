

package classes;

import java.util.Scanner;


public class transpose_of_matrix {
    public static void main(String args[]){
     
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of rows of matrix:");
    int r = input.nextInt();
    System.out.println("Enter number of columns of matrix:");
    int c = input.nextInt();
    
    int[][] matrix = new int[r][c];
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            System.out.println("Enter element of ["+i+"]["+j+"]:");
            matrix[i][j] = input.nextInt();
        }
    }
    System.out.println("The matrix you entered is: ");
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            System.out.print(matrix[i][j]+"\t");
        }
        System.out.print("\n");
    }
    
    System.out.println("The transpose of matrix you entered is: ");
    for (int i=0;i<c;i++){
        for (int j=0;j<r;j++){
            System.out.print(matrix[j][i]+"\t");
        }
        System.out.print("\n");
    }
    }
}
