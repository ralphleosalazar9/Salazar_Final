
/**
 * Write a description of class Salazar15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Salazar15
{
    public static void main (String [] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        boolean found = false; 
        System.out.print("Numbers greater than 50: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                System.out.print(numbers[i] + " ");
                found = true; 
            }
        }

        if (!found) { 
            System.out.print("None!");
        }
    }
}