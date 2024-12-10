public class Transwith_MxN {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4,5,6},{3,4,5,6,7},{5,6,7,8,9}};
        int[][] brr= new int [arr[0].length][arr.length];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                brr[i][j] = arr[j][i];
            }
        }
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(brr[i][j]);
            }
            System.out.println();
        }
    }
}
