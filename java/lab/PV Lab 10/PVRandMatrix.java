/** File: Week10/Lab10Sol/Matrices/PVRandMatrix.java @PV Pho Vu
 * Generate and display a matrix 3 x 3 with 0 and 1 randomly
 */

import java.util.*; // import all functions from java.util package

public class PVRandMatrix { // start class
    final static int n = 3; // set value for integer as 3

    public static void main(String[] args) { // start main
        int[][] B = new int[n][n];
        generation(B); print(B);
    } // end main

    static void generation(int[][] B) { // start generation
        for (int i = 0; i < n; i++) { // set rows
            for (int j = 0; j < n; j++) { //set columns
                B[i][j] = (int) (Math.random() * 2); // 0 1
            } // end for 2
        } // end for 1
    } // end generation

    static void print(int [][]B){ // start print
        for (int [] A : B){
            System.out.println(Arrays.toString(A)); // display array
        } // end for
    }// end printed
}// end class
