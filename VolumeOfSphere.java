import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of sphere:");
        double R = s.nextDouble();


        double volume = VolumeOfSphere.area(R);

        System.out.println("Volume Of Sphere is:" + volume);
    }

    public static double area(double R) {

        double volume = (4 * 22 * R * R * R) / (3 * 7);

        return volume;
    }
}