import java.util.*;
public class Sprialfrom1ton2 {
    public static void main(String[] args) {
        System.out.println("1 to n^2");
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of n");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int minR = 0;
       int maxR = arr.length-1;
       int minC = 0;
       int maxC = arr[0].length-1;
       int count =0;
       int tC = n*n;
       while(count<tC){
           //minR++
           for(int j=minC;j<=maxC&&count<tC;j++){
            
            count++;   
            arr[minR][j] = count;
           }
           minR++;
           //
           for(int i=minR;i<=maxR&&count<tC;i++){
             
               count++;   
               arr[i][maxC] = count;
              }
             maxC--;
             //
              for(int j=maxC;j>=minC&&count<tC;j--){
             
               count++;   
               arr[maxR][j] = count;
              }
              maxR--;
              //
              for(int i=maxR;i>=minR;i--){
      
               count++;   
               arr[i][minC] = count;
              }
             minC++;
       }
        System.out.println("Matrix:");
       for(int i=0;i<arr[0].length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
}
