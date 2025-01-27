import java.util.Scanner;

public class gradeCheck {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Grade(A,B,C,D,E,F) : ");
        char grade=sc.next().charAt(0);
        
        //switch case to check grade
        switch(grade){
            case 'A':
                System.out.println("You scored greater than 90");
                break;
            case 'B':
                System.out.println("You scored greater than 80");
                break;
            case 'C':
                System.out.println("You scored greater than 70");
                break;
            case 'D':
                System.out.println("You scored greater than 60");
                break;
            case 'E':
                System.out.println("You scores greater than 50");
                break;
            case 'F':
                System.out.println("You Failed");

                //this block executes for any invalid input
            default:
                System.out.println("Invalid Input");
                break;

            }
        }

    }
