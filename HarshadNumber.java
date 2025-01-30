import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number :");
        int num=sc.nextInt();
        
        int org=num;
        int sum=0;

        //Loop to calculate the sum of the Number
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }


        //check if the original number is divisible by sum of its number
        if(org%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a Harshad Number");
        }


    }
    
}
