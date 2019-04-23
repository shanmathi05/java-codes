import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String arrge[]) {


        Scanner s = new Scanner (System.in);

        System.out.println("enter the radius of the circle ");

        double R =s.nextDouble();

        double area =(22*R*R)/7;

        System.out.println( "area of the circle is :"   + area);

    }

}
