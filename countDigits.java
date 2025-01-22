import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int digit = sc.nextInt();
        int count = 0;

        // Special case: A number 0 has exactly one digit
        if (digit == 0) {
            count = 1;
        } else {
            // Loop to count the number of digits in the given number
            while (digit > 0) {
                digit = digit / 10; // Remove the last digit
                count++; // Increment count for each digit
            }
        }

        System.out.print(count); // Output the total count of digits
    }
}
