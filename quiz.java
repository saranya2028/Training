import java.io.*;
import java.util.Scanner;

class Quiz {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int x = scanner.nextInt(); // Alaric's fixed number
        int y = scanner.nextInt(); // Seraphina's fixed number
        int n = scanner.nextInt(); // Total number of puzzles
        
        scanner.close();
        
        // Calculate the number of puzzles each can solve
        int alaricPower = gcd(x, n);
        int seraphinaPower = gcd(y, n);
        
        // Determine and print the winner
        if (alaricPower >= seraphinaPower) {
            System.out.println("Alaric unravels the most Mystical Scrolls in the Grand Library!");
        } else {
            System.out.println("Seraphina unravels the most Mystical Scrolls in the Grand Library!");
        }
    }

  
}