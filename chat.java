class Chat {
    public static void main(String[] args) {
        int n = 10; // You can change this value to get the first n palindromic prime numbers
        int count = 0;
        int num = 2;

        System.out.println("First " + n + " palindromic prime numbers:");
        while (count < n) {
            if (isPrime(num) && isPalindrome(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i*i <=num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}