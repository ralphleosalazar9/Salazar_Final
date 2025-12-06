
/**
 * Write a description of class Salazar14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar14
{
    public static void main (String [] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Original array: ");
        for (int r = 0; r < numbers.length; r++) {
            System.out.print(numbers[r] + " ");
        }

        System.out.println();

        System.out.print("\nReversed array: ");
        for (int r = numbers.length - 1; r >= 0; r--) {
            System.out.print(numbers[r] + " ");
        }
    }
}