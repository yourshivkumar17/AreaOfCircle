import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int radius = sc.nextInt();
        double areaofcircle = (3.14 *radius* radius);
        System.out.println(areaofcircle);
    }
}