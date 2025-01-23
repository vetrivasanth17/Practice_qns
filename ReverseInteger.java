public class ReverseInteger {
    public static void main(String[] args) {
        int num = 1234; // Input number
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num = num / 10; // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}

