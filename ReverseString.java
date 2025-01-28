import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string: ");
        String s1=sc.nextLine();

        //call the reversed method to reverse the string
        String reversed= reverse(s1);
        System.out.println(reversed);
    }
        
    //method to reverse the string  
    public static String reverse(String str){
        String reversed="";

        //Loop through last character to first
        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);//Add each character to the reversed string
        }

        return reversed;
    }
}