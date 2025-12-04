
/**
 * Write a description of class Salazar4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar4
{
    public static void main (String [] args) {
        
        int [] nums = {5, 12, 3, 9, 25};
        
        int smallest = nums[0];
        int largest = nums[0];
        
        for (int r = 1; r < nums.length; r++)
        {
            if (nums[r] < smallest) {
                smallest = nums[r];
            }
            if(nums[r] > largest) {
                largest = nums[r];
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        System.out.println("Largest number: " + largest);
    }
}