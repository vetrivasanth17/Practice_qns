import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int num=sc.nextInt();
        int sum=0;


        // Finding the sum of proper divisors of the number
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;//Adding the divisors
            }
        }

        // If the sum of divisors equals the number, it's a perfect number
        if(num==sum){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
