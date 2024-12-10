public class addmatrix {
    public static void main(String[] args){
        int[][] arr1 = {{2,3},{10,20}};
        int[][] arr2 = {{4,5},{20,10}};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
