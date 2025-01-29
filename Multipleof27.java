import java.util.Scanner;
public class Multipleof27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();

        //check divisibility by 27

        if(num%27==0)//If the remainder is 0,it is a multiple of 27
            System.out.println(num+" is a multiple of 27");
        else
            System.out.println(num+" is not a multiple of 27");
    }
    
}
