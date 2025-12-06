
/**
 * Write a description of class Salazar16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Salazar16
{
   public static void main (String [] args) {
       
       Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = 0;

        if (number == 0) { 
            count = 1;
        } else {
            while (number > 0) {
                number = number / 10; 
                count++;              
            }
        }

        System.out.println("Number of digits: " + count);
   }
}