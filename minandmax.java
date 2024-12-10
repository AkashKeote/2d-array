public class minandmax {
    public static void main(String[] args) {
        int arr[][] = {{1,4},{6,12}};
        int max = Integer.MIN_VALUE;
        int maxR=0,maxC=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                maxR = i;
                maxC = j;}
            }
        }
        System.out.println("Max :"+max);
        System.out.println("return new int[]{maxR,maxC}"+ maxR+" "+maxC);
        int min = Integer.MAX_VALUE;
        int minR=0,minC=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(min<arr[i][j]){
                    min = arr[i][j];
                minR = i;
                minC = j;
            }}
        }
        System.out.println("MIN :"+"return new int[]{minR,minC}"+minR+" "+minC);

    }
}
