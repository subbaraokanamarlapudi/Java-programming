import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle :");
        /*int*/double length = sc.nextDouble(); /*nextInt()*/ 

        System.out.print("Enter the width of the rectangle :");
        /*int*/double width = sc.nextDouble();   /*nextInt()*/ 

        // Area of rectangle -----------> length*width
        /*int*/double area = length*width;

        System.out.println("Area of rectangle is: "+area);
    }
    
}
