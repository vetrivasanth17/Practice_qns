import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter principle :");
        double principle=sc.nextDouble();

        System.out.print("Enter rate :");
        double rate=sc.nextDouble();

        System.out.print("Enter Time :");
        double time=sc.nextDouble();

        double SimpleInterest=(principle*rate*time)/100;
        System.out.print("Simple Interest is :"+SimpleInterest);
    }
}
