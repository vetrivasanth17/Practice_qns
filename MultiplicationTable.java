import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class MultiplicationTable {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter a number :");
    int num=sc.nextInt();

    //Loop to print Multiplication Table
    for(int i=1;i<=10;i++){
        System.out.println(num+" x "+i+" = "+ num*i);
    }

    }
}
