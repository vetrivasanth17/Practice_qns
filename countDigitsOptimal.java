import java.util.Scanner;
public class countDigitsOptimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int digit = sc.nextInt();
        int count;

        // Check for the special case where the input is 0
        if (digit == 0) {
            count = 1; // 0 has exactly one digit
        } else {
            // Use Math.log10() to calculate the number of digits directly
            count = (int) Math.floor(Math.log10(digit)) + 1;
        }

        System.out.print(count); // Output the total count of digits
    }
}
