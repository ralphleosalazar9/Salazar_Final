
/**
 * Write a description of class Salazar18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar18
{
    public static void main (String [] args) {
        
        int[] salz = {10, 20, 30, 10, 50}; 
        
        boolean hasDuplicate = false; 

        for (int r = 0; r < salz.length; r++) {
            for (int s = r + 1; s < salz.length; s++) {
                if (salz[r] == salz[s]) {
                    hasDuplicate = true;
                    break; 
                }
            }
            if (hasDuplicate) {
                break; 
            }
        }

        if (hasDuplicate) {
            System.out.println("The array contains duplicated values.");
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }
}