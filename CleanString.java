import java.util.Scanner;
public class CleanString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String s1=sc.next();

        //remove Special characters and Digits
        System.out.println(s1.replaceAll("[^a-zA-Z]",""));
    
}    
}
