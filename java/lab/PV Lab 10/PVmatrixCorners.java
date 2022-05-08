 /** File: Week10/Lab10Sol/Matrices/PVMatrixCorners  @PV Pho Vu
  * You are given in your program a matrix n x m.
  * Example: int [][] M = {{1,2,3},{4,5,6}};
  * Display it and display its 4 corners.
  * Design the program in such a way that you can change the size of matrix.
  */

import java.util.Arrays; // import Arrays class from java.util package
public class PVmatrixCorners { // start class
    public static void main(String[] args) {
        int [][] M = {{1,2,3},{4,5,6}};
        for (int i = 0; i < M.length; i++) {
            System.out.println(Arrays.toString(M[i]));
        } // end for
        System.out.println("Corners are " + M[0][0] + " " +M[0][(M[0].length-1)] + " " +
                    M[M.length-1][0] + " " + M[M.length-1][M[0].length -1]);
    } // end main
} // end class
