package java_problems;
import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		

        // Check if the number is divisible by both 3 and 5
		if(num%3==0 && num%5==0) {
			System.out.println("Fizz Buzz");
		}
		  // Check if the number is divisible by 3 only
		else if(num%3==0) {
			System.out.println("Fizz");
		}
		// Check if the number is divisible by 5 only
		else if(num%5==0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println("The number is not divided by 3 and 5");
		}
	}

}
