import java.util.Scanner;
public class PalindromeCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a String/number: ");
        String a=sc.nextLine().toLowerCase();//replace upper case to lower case

        char[] ch=a.toCharArray();//convert string to charracter array
        int j=ch.length-1;//set pointer to last character

        for(int i=0;i<=j/2;i++,j--){
            if(ch[i]!=ch[j]){//if characters don;t match
                System.out.println("Not a palindrome");
                return;//Exit immediately
            }   
        }

        System.out.println("palindrome");
    }
}
