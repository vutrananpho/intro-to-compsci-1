/** File: Week4/Lab4Sol/Strings/PVSwap.java @PV Pho Vu
 * Swap first letter with the last letter.
 Example: Mary becomes: yarM
 * USE: s.charAt(s.length()-1) + s.substring(1,s.length()-1) + s.charAt(s.length()-1)
 * #9 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package

public class PVSwap { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter your name: "); // ask for user's input
        String name = scanner.next(); // read user's input
        char first = name.charAt(0); // declare character variable that takes first letter
        int length = name.length(); // declare integer variable for length of string
        char last = name.charAt(length - 1); // take the last letter
        String middle = name.substring(1, length - 1); // for the remaining letters in the middle of string

        System.out.println(last + middle + first); // display string after first & last letters are swapped
    } // end main
} // end class
