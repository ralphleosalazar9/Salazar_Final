
/**
 * Write a description of class Salazar12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar12
{
    public static void main (String [] args) {
        
        int[] salz = {5, 1, 5, 3, 5, 5, 6};
        int target = 5; 
        int count = 0;

        for (int r = 0; r < salz.length; r++) {
            if (salz[r] == target) {
                count++;
            }
        }
        
        if (count >= 3) {
            System.out.println(target + " appears at least 3 times.");
        } else {
            System.out.println(target + " does NOT appear 3 times. There are only " + count + " number 5.");
        }
    }
}