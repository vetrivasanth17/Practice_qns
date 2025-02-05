import java.util.Scanner;

public class GCD{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=sc.nextInt();

        //Using Euclidean algorith to find GCD
        while(num1>0 && num2>0){
            if(num1>num2){
                num1=num1%num2;
            }
            else{
                num2=num2%num1;
            }
        }

        //Non zero value after the loop end's is GCD
        if(num1==0){
        System.out.println("Gcd og given number is: "+num2);
        }
        
        else{
            System.out.println("Gcd og given number is: "+num1);
        }

    }
}


   