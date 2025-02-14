import java.util.Scanner;

 class Duplicate {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        int num=292;

        while (n!= 0) {
            arr[n % 10]++;
            n /= 10;
           
        }
        int count=0;
        for(int i=0;i<10;i++){
            if(arr[i] !=0)         
            count++;
        }
        System.out.println(count);
        
        
    }
}