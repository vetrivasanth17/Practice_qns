import java.util.Scanner;
public class AddandSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //calculation addition and subtraction
        System.out.println("Entter num1: ");
        int num1=sc.nextInt();

        System.out.println("Enter num2: ");
        int num2=sc.nextInt();

        int add=Math.abs(num1+num2);
        int sub=Math.abs(num1-num2);

        System.out.println("Sum: "+add);
        System.out.println("Diiference "+sub);


    }
    
}
