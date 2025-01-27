import java.util.Scanner;
public class SwapNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter second Number: ");
        int num2=sc.nextInt();

        //swapping using third variable

        int temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After swapping, first number: " +num1+ " and second number is " +num2);



    }
}