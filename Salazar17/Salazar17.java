
/**
 * Write a description of class Salazar17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Salazar17
{
    public static void main (String [] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int r = 0; r < numbers.length; r++) {
            System.out.print("Number " + (r + 1) + ": ");
            numbers[r] = input.nextInt();
        }

        int highest = numbers[0];        
        int secondHighest = 0;           

        for (int r = 1; r < numbers.length; r++) {
            if (numbers[r] > highest) {
                secondHighest = highest;
                highest = numbers[r];
            } else if (numbers[r] > secondHighest && numbers[r] != highest) {
                secondHighest = numbers[r];
            }
        }

        System.out.println("Second highest number is: " + secondHighest);
    }
}