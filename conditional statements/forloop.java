public class forloop {
    public static void main(String args[])
    {
        int sum = 0;
        for(int i=1; i<=100;i++)
        {
            sum = i+sum;
        }

        System.out.println("The sum of first 5 natural numbers is:"+sum);
    }
}
