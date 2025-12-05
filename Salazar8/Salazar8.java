
/**
 * Write a description of class Salazar8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salazar8
{
    public static void main(String [] args) {
        
        int[] A = {5, 10, 15, 20, 25};
        int[] B = new int[A.length];  

        
        for (int r = 0; r < A.length; r++) {
            B[r] = A[r];
        }

        
        System.out.println("Array A:");
        for (int r = 0; r < A.length; r++) {
            System.out.print(A[r] + " ");
        }

        
        System.out.println("\n\nArray B (copied values):");
        for (int r = 0; r < B.length; r++) {
            System.out.print(B[r] + " ");
        }
    }
}