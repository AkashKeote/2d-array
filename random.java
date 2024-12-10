import java.util.*;
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int[][] arr1 = {{1,2,4,5,6},{3,4,5,6,7},{5,6,7,8,9}};
    System.out.println("(r1,c1)");
        int r1 = sc.nextInt(),c1=sc.nextInt();
        System.out.println("(r2,c2)");
        int r2 = sc.nextInt(),c2=sc.nextInt();
        
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr1[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
