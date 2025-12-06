
/**
 * Write a description of class salazar13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class salazar13
{
    public static void main (String [] args) {
        
        int[] grades = {80, 65, 90, 70, 76, 50, 88};

        int passed = 0;
        int failed = 0;

        for (int r = 0; r < grades.length; r++) {
            if (grades[r] > 75) {
                passed++;
            } else if (grades[r] < 75) {
                failed++;
            }
        }

        System.out.println("Number of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);
    }
}