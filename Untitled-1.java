import java.util.Scanner;

class Untitled1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        int arr[][] = new int[n][3];
        for(int i=0;i<n;i++){
         
            System.out.print("Enter Marks of "+"Student "+(i+1));
            System.out.println();
                System.out.println("Enter marks of Physic");
                arr[i][0] = sc.nextInt();
                System.out.println("Enter marks of Chemistry");
                arr[i][1] = sc.nextInt();
                System.out.println("Enter marks of Maths");
                arr[i][2]= sc.nextInt();
            }
            System.out.println();
        
     for(int i=0;i<n;i++){
         for(int j=0;j<3;j++){
             System.out.print(arr[i][j]+" ");
         }
         System.out.println();
     }
    }
}