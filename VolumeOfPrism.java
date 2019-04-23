import java.util.Scanner;

public class VolumeOfPrism
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the area of base:");
        double base=s.nextDouble();
        System.out.println("Enter the height:");
        double height=s.nextDouble();

        double  A= VolumeOfPrism.Volume(base,height);

        System.out.println("Volume Of Prism is:" +A);
    }
    public static double Volume(double B,double H)
    {

        double  A=B*H ;

        return A;
    }
}
