public class maximumNoOfOnes {
    public static void main(String[] args) {
        int max = 0;
        int arr[][] = { {1, 1, 0, 1}, {1,1, 1, 1}, {0, 0, 0, 0} };
        int count = 0;
            int idx = 0;
        for (int i = 0; i < arr.length; i++) {
           count =0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) count++;
                if (max < count) {
                    max = count;
                    idx = i;
                }
            }
            
          }
          System.out.println("Max no 1's:"+max+ " "+" Row: "+idx);
    }
}
