/**File: Week10/Lab10Sol/Matrices/PVRandMatrix.java @PV Pho Vu
 * Give a square matrix (int [][] A = {{1,2,3},{4,5,6},{7,8,9}};);
 * Display it and display the first and second diagonal.
 * Design the program in such a way that you can change the size of your squared matrix.
 */
import java.util.Arrays; // import Arrays class from java.util package
public class PVMatrixDiagonals { // declare public class
    public static void main(String[] args) { // start main
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}}; // array
        print(A); firstdiagonal(A); seconddiagonal(A);
    } // end main
    static void firstdiagonal (int [][] A) { // initialize firstdiagonal
        for (int i = 0; i < A.length; i++) { // set rows
            System.out.print(A[i][i] + "\t"); // display matrix
        } // end for
    }// end firstdiagonal

    static void seconddiagonal (int [][] A) { // initialize seconddiagonal
        for (int i = 0; i < A.length; i++) { // set rows
            System.out.print(A[i][A.length - 1 - i] + "\t"); // display matrix
        } // end for
    } // end seconddiagonal

    static void print(int [][] A) { // initialize print
        for (int [] M : A) { // set rows
            System.out.println(Arrays.toString(M)); // display matrix
        }// end print
    } // end print2
} // end class