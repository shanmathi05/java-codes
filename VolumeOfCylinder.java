import java.util.Scanner;

public class VolumeOfCylinder
{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);

        System.out.println("Enter the radius:");
        double R=s.nextDouble();
        System.out.println("Enter the height:");
        double H=s.nextDouble();


        double  a=VolumeOfCylinder.Volume(R,H);

        System.out.println("Volume Of  Cylinder is:" +a);
    }

    public static double Volume(double R,double H)
    {

        double  a=((22*R*R*H)/7);


        return a;
    }

}

