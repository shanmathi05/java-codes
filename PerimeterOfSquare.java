import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the side of the square:");

        double A= s.nextDouble();

        double  perimeter=4*A;

        System.out.println("perimeter of Square is: " + perimeter);
    }
}
