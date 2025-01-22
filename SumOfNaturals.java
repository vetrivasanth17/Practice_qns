import java.util.Scanner;
public class SumOfNaturals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Positive Number:");
        int num=sc.nextInt();
        int i=1;
        System.out.println("Natural number upto "+num+" is: ");
        while(num>=i){
            System.out.print( i +" ");
            i++;
        }
        System.out.println();
        int sum=(num*(num+1))/2;
        System.out.println("Sum of Naturals: "+sum);
    
    }

}