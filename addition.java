import java.util.Scanner;
public class addition
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        x = sc.nextInt();
        System.out.println("Enter Second number: ");
        y = sc.nextInt();
        z = x + y;     // for substraction use z = x - y , z=x*y , z=x/y , z=x%y;
        System.out.println("Sum of the numbers: "+z); //-z, *z, /z , %z;

    }
}
