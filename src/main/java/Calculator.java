import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the fist number:");
        float num1 = scan.nextFloat();

        System.out.print("Enter the second number:");
        float num2 = scan.nextFloat();

        int res;

        System.out.print("Math action:");
        String action = scan.nextLine();
        action = scan.nextLine();

        switch (action) {
            case "+":
                res = (int) (num1 + num2);
                System.out.println("Math action:" + res);
                break;
            case "-":
                res = (int) (num1 - num2);
                System.out.println("Math action:" + res);
                break;
            case "*":
                res = (int) (num1 * num2);
                System.out.println("Math action:" + res);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    res = (int) (num1 / num2);
                    System.out.println("Math action:" + res);
                }
                break;
            default:
                System.out.println("Value is not valid");
        }
    }
}

//        float res1 = num1 + num2;
//        float res2 = num1 - num2;
//        float res3 = num1 * num2;
//        float res4 = num1 / num2;
//
//        System.out.println("Calculation result:");
//        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n");
//
//        System.out.print("Do you want me to guess the number?");
//
//        System.out.print("Enter a number from 0 to 10");
//        int num = scan.nextInt();
//    }
//}
