public class sumofmatrix2d {
    public static void main(String args[]){
        int sum = 0;
        int arr[] = {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
        sum = 0;
        int[][] arr1 = {{1,2},{3,4},{5,6}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                sum+=arr1[i][j];
            }
        }
        System.out.println(sum);
    }
}
