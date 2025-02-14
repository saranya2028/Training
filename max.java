import java.util.Scanner;

public class MaxInArray {
    public static void main(String[] args) {
    

        int[] array = new int[10];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i <size; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The maximum element in the array is: " + max);
    }
}