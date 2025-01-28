import java.util.Scanner;
public class WashingMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        
        // Check the weight and calculate the time
        if (weight == 0) {
            System.out.println("Time Estimated: 0 Minutes");
        } 
        else if (weight > 0 && weight <= 2000) {
            System.out.println("Time Estimated: 25 Minutes");
        } 
        else if (weight >= 2001 && weight <= 4000) {
            System.out.println("Time Estimated: 35 Minutes");
        }
        else if (weight >= 4001 && weight <= 7000) {
            System.out.println("Time Estimated: 45 Minutes");
        }
        else if (weight > 7000) {
            System.out.println("OVERLOADED");
        } 
        else {
            System.out.println("INVALID INPUT");
        }
    }
}
