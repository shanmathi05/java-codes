import java.util.Scanner;

public class AreaOfRectangle
{

    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the length:");
        double L= s.nextDouble();
        System.out.println("Enter the breadth:");
        double B= s.nextDouble();


        double  area=L*B;
        System.out.println("Area of Rectangle is: " + area);
    }}
