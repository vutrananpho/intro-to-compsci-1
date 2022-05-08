/** File: Week10/Lab10Sol/Matrices/PVAddAllMatrix.java @PV Pho Vu
 * You are given in your program a matrix n x m.
 * Example: int [][] M = {{1,2,3},{4,5,6}};
 * Add all numbers.
 * In this case result is: sum = 21
 */

public class PVAddAllMatrix { // start class
    final static int n = 2, m = 3; //value of integer as 2 and 3

    public static void main(String[] args) {
        int M[][] = {{1, 2, 3}, {4, 5, 6}};
        print(M);
        System.out.println("The sum of matrix elements = " + addNumber(M));
    } // end main

    static void print(int[][] M) { // print matrix
        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < m; j++) { // columns
                System.out.print(M[i][j] + " ");
                ; // display matrix
            } // for-loop column
            System.out.println(); //jumps to the next line
        }// for loop for rows

    } // end print

    static int addNumber(int[][] M) { // goes through the matrix and adds each number
        int sum = 0; //start with 0
        for (int i = 0; i < n; i++) { // set rows
            for (int j = 0; j < m; j++) { // set columns
                sum += M[i][j]; // add an index
            }
        } // end for
        return sum;
    } // end addNumber

} // end class