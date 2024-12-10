import java.util.*;
public class add2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int[][] arr1 = new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               arr1[i][j] = sc.nextInt();
            }
        }
          System.out.println("Enter the number of rows and columns of second matrix");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr2 = new int[p][q];
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
               arr2[i][j] = sc.nextInt();
            }
        }
      if(m==p&&n==q){ 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int sum = arr1[i][j]+arr2[i][j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("not Possible!!!!");
    }
    }
}
