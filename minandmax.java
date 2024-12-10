public class minandmax {
    public static void main(String[] args) {
        int arr[][] = {{1,4},{6,12}};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                max = Math.max(max,arr[i][j]);
            }
        }
        System.out.println("Max :"+max);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                min = Math.min(min,arr[i][j]);
            }
        }
        System.out.println("MIN :"+min);

    }
}
