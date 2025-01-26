
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int fact=1;

        // Loop from 1 to 'num' to calculate the factorial
        for(int i=1;i<=num;i++){
            fact*=i; //multiply i with fact in each iteration
        }
        System.out.println("Factorial of "+num+" is "+fact);

    }
}
