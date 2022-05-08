/** File/Week1/Lab1Sol/Hello/PVBytes2bits.java @PV Pho Vu
 * Write a program to convert n (in)bytes to bits.
 * Ex. generate random number: int n = (int)(Math.random() *100).
 * If n = 10 result is 80 bits/
 * #9 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package
public class PVBytes2bits { // start class
    public static void main(String[] args) { // start main
        Scanner bytes = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter bytes: "); // ask for user's input
        int b = bytes.nextInt(); // read user's input (bits)
        System.out.println("Convert to bytes: " + b*8); // display bytes
    } // end main
} // end class
