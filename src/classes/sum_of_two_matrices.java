
package classes;
import java.util.Scanner;
public class sum_of_two_matrices {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r=input.nextInt();
        System.out.print("Enter no. of columns: ");
        int c=input.nextInt();
        
        int[][] matrix1=new int[r][c];
        int[][] matrix2=new int[r][c];
        int[][] sum=new int[r][c];
        
        System.out.println("Enter element for matrix1:");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter element ["+i+"]["+j+"]:");
                matrix1[i][j]=input.nextInt();
            }
        }
        
        System.out.println("Enter element for matrix2:");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter element ["+i+"]["+j+"]:");
                matrix2[i][j]=input.nextInt();
            }
        }
        
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        
        System.out.println("Sum of two matrices is: ");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
