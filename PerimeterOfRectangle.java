import java.util.Scanner;

public class PerimeterOfRectangle
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle:");

        double L= s.nextDouble();

        System.out.println("Enter the width of the Rectangle:");

        double B= s.nextDouble();

        double  perimeter=2*(L+B);

        System.out.println("perimeter of Rectangle is: " + perimeter);
    }
}
