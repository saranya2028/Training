
import java.util.Scanner;
class Arrays{
     public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//rows
        int m=sc.nextInt();//colums
        int[][] arr=new int[n][m];


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)//(0,0)(0,1)(0,3) next only i increment
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            
        }

    }
}