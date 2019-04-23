import java.util.Scanner;

public class AreaOfTriangle
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double B= s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double H= s.nextDouble();

        //Area = (width*height)/2
        double area=(B*H)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}
