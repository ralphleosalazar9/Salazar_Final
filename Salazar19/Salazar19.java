
/**
 * Write a description of class Salazar19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar19
{
   public static void main (String [] args) {
       
       String[] students = {"Alice", "Bob", "Charlie", "David", "Eva"};

        int[] grades = {85, 90, 78, 92, 88};

        System.out.println("Student Grades:");
        for (int r = 0; r < students.length; r++) {
            System.out.println(students[r] + ": " + grades[r]);
        }
   }
}