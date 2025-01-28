import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1=sc.next();

        //outer loop iterates for starting index
        for(int i=0;i<s1.length();i++){
            //inner loop iteates for ending index
            for(int j=i+1;j<=s1.length();j++){
                System.out.println(s1.substring(i, j));
            }
        }
    }
}
