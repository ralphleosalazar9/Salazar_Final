
/**
 * Write a description of class Salazar10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar10
{
   public static void main (String [] args) {
       
       int [] salz = {3, 7, 8, 9, 10, 13};
       int index = -1;
       
       for (int r = 0; r < salz.length; r++) {
           if (salz[r] % 2 == 0) {
               index = r;
               break;
           }
       }
       
       if (index != -1) {
           System.out.println("The first even number is at index: " + index);
       } else {
           System.out.println("No even number found in the array.");
       }
   }
}