import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int count=sc.nextInt();

        int num1=0;
        int num2=1;
        System.out.print(num1+" "+num2);
        
        // Loop to generate the remaining Fibonacci numbers
        for(int i=2;i<count;i++){
            int num3=num1+num2;//calculates the next term
            System.out.print(" "+num3);//print the current term

            num1=num2;
            num2=num3;

        }
    }
}
