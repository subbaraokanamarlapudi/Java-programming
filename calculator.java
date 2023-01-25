// import java.util.Scanner;

// public class calculator {
//     public static void main(String args[])
//     {
//         int a,b,result;
//         char oper;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number:");
//         a = sc.nextInt();

//         System.out.println("Enter the second number:");
//         b = sc.nextInt();

//         System.out.println("Choose an operator: +, -, *, /, %");
//         oper = sc.next().charAt(0);

//         switch(oper)
//         {
//             case 1:
//             System.out.println("a+b");
//             break;

//             case 2:
//             System.out.println("a-b");
//             break;

//             case 3:
//             System.out.println("a*b");
//             break;

//             case 4:
//             System.out.println("a/b");
//             break;

//             case 5:
//             System.out.println("a%b");
//             break;

//             default:
//             System.out.println("Invalid operator");
//             break;
//         }
//     }
// }


import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        scanner.close();
    }
}
