import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your role:");
        String role = scanner.nextLine();
        System.out.print("Enter your passport:");
        String pass = scanner.nextLine();
        if (role.equals("Admin") && pass.equals("12345")) {
            System.out.println("All users list:");
        } else {
            System.out.println("Hello!!! How your name?");
            String name = scanner.nextLine();
            System.out.print(name + " Do you want me to get a prediction for today?" + "\n");
            System.out.print("Enter a number for 0 to 5:");
            int num  = scanner.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Today is your lucky day!");
                    break;
                case 1:
                    System.out.println("Good weather today, time to meet friends.");
                    break;
                case 2:
                    System.out.println("Profit will come today!");
                    break;
                case 3:
                    System.out.println("Today you need delicious food.");
                    break;
                case 4:
                    System.out.println("Today you are the most beautiful");
                    break;
                case 5:
                    System.out.println("A miracle will happen today!" +
                            "");
                    break;
                default:
                    System.out.println("Number not recognized (((");
            }
        }
    }
}
