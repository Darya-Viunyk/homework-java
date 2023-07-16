import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Take user`s name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

//        Greet the user
        System.out.println("Hi "+ name + " how high do you want to count?");

//        Get the count limit from the user
        System.out.println("Enter the count limit:");
        int countLimit = scanner.nextInt();

//        Output numbers from 1 up to the count
        for (int i = 1; i <= countLimit; i++){
            System.out.println(i);
        }
//Close the scanner
        scanner.close();
    }
}
