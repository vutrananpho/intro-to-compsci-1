/** File: Week8/Lab8Sol/Arrays/PVArrayReverse  @PV Pho Vu
 * An array of numbers size 5 is given in your program.
 * Print: as it is, in reverse order, and then sorted
 * Use: Arrays.sort(A)
 * #2 in Lab
 */

import java.util.Arrays; // import Arrays class from java.util package

public class PVArrayReverse { // start class
    public static void main(String[] args) { // start main
        int [] A = {7,5,2,6,1}; // set an array
        for (int i = A.length - 1; i >= 0; i--){ // for loop through numbers in array
            System.out.println(A[i]); // display each number in given array
        } // end for
        Arrays.sort(A); // sort array
        System.out.print(Arrays.toString(A)); // print array
    } // end main
} // end class