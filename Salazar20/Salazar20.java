
/**
 * Write a description of class Salazar20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar20
{
    public static void main (String [] args) {
        
        int[] salz = {10, 25, 30, 42, 19, 50, 7};

        System.out.print("Even numbers greater than 20: ");
        for (int r = 0; r < salz.length; r++) {
            if (salz[r] > 20 && salz[r] % 2 == 0) {
                System.out.print(salz[r] + " ");
            }
        }
    }
}