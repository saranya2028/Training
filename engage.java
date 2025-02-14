import java.util.Scanner;

 class SpaceBelts {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Read the 3 input strings
        String belt1 = scanner.nextLine().trim();
        String belt2 = scanner.nextLine().trim();
        String belt3 = scanner.nextLine().trim();
        
        // Check if all inputs are valid ('engaged' or 'disengaged')
        if (isValid(belt1) && isValid(belt2) && isValid(belt3)) {
            if (belt1.equals("engaged") && belt2.equals("engaged") && belt3.equals("engaged")) {
                System.out.println("Initiating Warp Drive!");
            } else {
                System.out.println("Hold On! Some Belts are Adrift.");
            }
        } else {
            System.out.println("Invalid Input");
        }
        
        // Close scanner to avoid resource leak
        scanner.close();
    }

    // Method to check if the input is either 'engaged' or 'disengaged'
    private static boolean isValid(String input) {
        return input.equals("engaged") || input.equals("disengaged");
    }
}
