import java.util.Arrays;

class Assignment {
    public static void main(String[] args) {
        String input = "WORLD WIDE WEB";
        String[] words = input.split(" ");
        int[] differences = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            int sum = 0;

            for (int j = 0; j < length / 2; j++) {
                sum += Math.abs(word.charAt(j) - word.charAt(length - j - 1));
            }

            differences[i] = sum;
        }

        System.out.println(Arrays.toString(differences));
    }
}