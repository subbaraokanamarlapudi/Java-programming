import java.util.Scanner;

public class multiplicationtable {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Multipication table of"+n);

        for(int i=1; i<=10; i++)
        {
            System.out.println(n + "*" + i + " = " +n*i);
        }
    }
}
