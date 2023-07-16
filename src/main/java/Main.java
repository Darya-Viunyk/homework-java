import java.util.ArrayList;
import java.util.List;

public class Main {
    public static boolean isEven(int number){
        return number %2 == 0;
/*Explanation:

This method takes an integer number as input.
It checks if the number is divisible by 2 using the modulo operator %.
If the remainder is 0 (i.e., the number is divisible by 2), it returns true indicating that the number is even.
Otherwise, it returns false indicating that the number is odd.

 */
    }
public static List<Integer> getEvenNumbers(int total){
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i=0; i <= total; i++){
            if(isEven(i)) {
                evenNumbers.add(i);
            }
    }
        return evenNumbers;
}
public static void main(String[] args){
        int number =7;
        boolean inNuberEven = isEven(number);

    String isNumberEven                ;
    isNumberEven = null;
    System.out.println("Is the number even?" + ":" + isNumberEven);

    int total =10;
    List<Integer> evenNumbersList = getEvenNumbers(total);
    System.out.println("Even number up to" + total + ":" + evenNumbersList);
}
}
/*This method takes an integer total as input, which represents the uppe      r limit of the range of numbers.
        It creates an empty evenNumbers list to store the even numbers.
        It iterates from 0 to total (inclusive) using a for loop.
        For each iteration, it calls the isEven method to check if the current number is even.
        If the number is even, it adds it to the evenNumbers list using the add method.
        After iterating through all the numbers, it returns the evenNumbers list containing the even numbers up to the total.
*/