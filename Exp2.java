import java.util.Scanner;

public class Exp2{
    public static void main(String args[])
    {
        int a;
        // num = 100;
        // System.out.println("This is num :"+num);
        // num = num * 2;
        // System.out.println("The value of num*2 is: ");
        // System.out.println(num);

        System.out.println("Enter 'a' value :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        a = a * 2;
        System.out.println("The value of 'a' is :");
        System.out.println(a);
    }
}