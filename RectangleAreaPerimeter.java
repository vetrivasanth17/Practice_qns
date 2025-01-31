import java.util.Scanner;
public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length :");
        double length=sc.nextDouble();

        System.out.println("Enter Width :");
        double breadth=sc.nextDouble();

        //Calculating Perimeter and Area of Rectangle
        double perimeter=2*(length+breadth);
        double area=length*breadth;

        System.out.println("Perimeter :"+perimeter);
        System.out.println("Area :"+area);
    }
    
}
