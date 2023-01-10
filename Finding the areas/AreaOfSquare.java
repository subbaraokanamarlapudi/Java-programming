import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String args[])
    {
        int area,side;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of side of a square: ");
        side = sc.nextInt();

        area = side * side;
        System.out.println("Area of square: "+area);

    }
    
}
