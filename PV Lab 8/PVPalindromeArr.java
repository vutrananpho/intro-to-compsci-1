/** File: Week8/Lab8Sol/Arrays/PVpalinArray.java @PV Pho Vu
 * Check if an array of integers is a palindrome.
 * #4 in Lab
 */
import java.util.Arrays; // import Arrays class from java.util package

public class PVPalindromeArr { // start class
    public static void main(String[] args) { // start main
        int [] A = {3, 55, 6, 1, 1, 6, 55, 3}; // array of numbers
        System.out.println("Display array: " + Arrays.toString(A)); // display array
        System.out.println("Is this array a palindrome? " + isPalindrome(A)); // Display result
    }// end main

    static boolean isPalindrome(int [] A) { // initialize isPalindrome
        for (int i = 0; i < A.length/2; i++) { // for loop for numbers
            if (A[i] != A[A.length - 1 - i]) {
                return false;
            }
        }// end for
        return true;
    }// isPalindrome
} // end class