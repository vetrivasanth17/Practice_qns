import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		/*If the year leaves a remainder of zero when divided by 4 and 400
			and does not leave a remainder of zero when divided by 100*/
		if((year%4==0 && year%100!=0) ||(year%400==0)) {
			System.out.println("It is leap year");
		}
		//otherwise it is not a leap year
		else {
			System.out.println("It is not a leap year");
			
		}
		
		
	}

}
