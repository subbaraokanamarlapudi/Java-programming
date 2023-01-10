import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String args[])
    {
        // int radius = 3;
        // System.out.println("The radius of the circle is: "+ radius);

        // double area = Math.PI * radius * radius;
        // System.out.println("Area of circle is: "+area);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;
        System.out.print("Area of Circle is: "+area);
    }
}