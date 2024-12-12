import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
         List<Integer> ar = new ArrayList<>();
        int minR = 0;
        int maxR = arr.length-1;
        int minC = 0;
        int maxC = arr[0].length-1;
        int count =0;
        int tC = arr.length * arr[0].length;
        while(count<tC){
            //minR++
            for(int j=minC;j<=maxC&&count<tC;j++){
               ar.add( arr[minR][j]);
             count++;   
            }
            minR++;
            //
            for(int i=minR;i<=maxR&&count<tC;i++){
                ar.add( arr[i][maxC]);
                count++;   
               }
              maxC--;
              //
               for(int j=maxC;j>=minC&&count<tC;j--){
                ar.add( arr[maxR][j]);
                count++;   
               }
               maxR--;
               //
               for(int i=maxR;i>=minR;i--){
                ar.add( arr[i][minC]);
                count++;   
               }
              minC++;
        }
        for(int val:ar){
            System.out.print(val+" ");
        }
    }
}
