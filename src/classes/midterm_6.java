
package classes;
import java.util.*;

public class midterm_6 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter m: ");
        int m=scan.nextInt();
        System.out.println("Enter n: ");
        int n=scan.nextInt();
        int arr1[][]=new int[m][n];
        int arr2[][]=new int[n][m];
        int result[][]=new int[m][m];
        
        System.out.println("Enter element of 1st matrix: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.println("matrix1["+i+"]["+j+"]: ");
                arr1[i][j]=scan.nextInt();
            }
        }
        
        System.out.println("Enter element of 2nd matrix: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println("matrix2["+i+"]["+j+"]: ");
                arr2[i][j]=scan.nextInt();
            }
        }
        result=matrixmultiply(arr1,arr2,m,n);
        System.out.println("Result Matrix is : ");
        for (int i=0;i<m;i++){
            for (int j=0;j<m;j++){
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
        static int[][] matrixmultiply(int[][] m1,int[][] m2,int m,int n){
            int result[][]=new int[m][m];
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    for(int k=0;k<n;k++){
                        result[i][j]+=m1[i][k]*m2[k][j];
                    }
                    
                }
            }
            return result;
        }
    
    
}
