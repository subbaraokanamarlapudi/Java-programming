public class Logical {
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        int c = 30;

        // if (a>b && a>c)
        // {
        //     System.out.println("First number is largest");
        // }
        // else if (b>a && b>c)
        // {
        //     System.out.println("Second number is largest");                      // AND operator
        // }
        // else
        // {
        //     System.out.println("Third number is largest");
        // }

        if(a>b || a>c)
        {
            System.out.print("First number is largest");
        }
        else if(b>a || b>c)
        {
            System.out.println("Second number is largest");                       // OR operator
        }
        else
        {
            System.out.print("Third number is the largest");
        }

    }
    
}
