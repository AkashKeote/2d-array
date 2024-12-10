public class maxrowsumwithindex {
    public static void main(String[] args) {
    int[][] arr1 = {{1,2,4,5,6},{10,4,5,6,11},{5,6,7,8,9}};
    int sum = 0;
    int maxS = 0;
    int sumi = 0;
    for(int i=0;i<arr1.length;i++){
        sum = 0; //reset
     for(int j=0;j<arr1[0].length;j++){
        sum += arr1[i][j];
          if(sum>maxS){
            maxS = sum;
            sumi = i;
          }
        }
    }
    System.out.println("Max Sum Of row :"+maxS+" "+"Index :"+sumi);
}
}