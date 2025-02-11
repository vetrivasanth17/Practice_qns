
import java.util.*;
public class Anagram {
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        //Convert Strings into Character Arrays
        char[] str1=a.toCharArray();
        char[] str2=b.toCharArray();

        //sort both character Arrays
        Arrays.sort(str1);
        Arrays.sort(str2);

        //Compare the sorted Arrays
        return Arrays.equals(str1,str2);
    }

public static void main(String args[]){
    System.out.println(isAnagram("earth","heart"));
}
}