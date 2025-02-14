 class Quis {
    public static void main(String[] args) {
        int number = 582109;
        int result = calculatePowerSum(number);
        System.out.println("The result is: " + result);
    }

    public static int calculatePowerSum(int number) {
        String numStr = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < numStr.length() - 1; i++) {
            int base = Character.getNumericValue(numStr.charAt(i));
            int exponent = Character.getNumericValue(numStr.charAt(i + 1));
            sum += Math.pow(base, exponent);
        }

        return sum;
    }
}