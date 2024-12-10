import java.util.*;
public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] arr1 = new int [m][n];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
               arr1[i][j] = sc.nextInt();
            }
        }
          System.out.println("Enter the number of rows and columns of second matrix");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr2 = new int[p][q];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[0].length;j++){
               arr2[i][j] = sc.nextInt();
            }
        }
       if(n==p){
        int [][]res =  new int[m][q];
        int np = 2;
        for(int i=0;i<m;i++){
            for(int j=0;j<q;j++){
                 res[i][j]=0;
                 for(int k=0;k<np;k++){
                    res[i][j] += arr1[i][k]*arr2[k][j];
                 }
            }
        }
        System.out.println("The resultant matrix is:");
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("Matrix multiplication is not possible");
    }
    sc.close();
        
    }
}
