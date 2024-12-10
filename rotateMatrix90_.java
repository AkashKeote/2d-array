public class rotateMatrix90_ {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4,5,6},{3,4,5,6,7},{5,6,7,8,9},{1,2,3,4,5},{6,4,5,2,3}};
        System.out.println("Original");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("TransPose");
        //transpose
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] =  arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //rotate
        System.out.println("Rotate");
        for(int i=0;i<arr.length;i++){
            int x = 0;
            int y = arr[i].length-1;
            while(x<y){
                int temp = arr[i][x];
                arr[i][x] = arr[i][y];
                arr[i][y] = temp;
                x++;
                y--;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
