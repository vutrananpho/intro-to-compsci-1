/** File: Week4/Lab4Sol/Strings/PVLowerUpper.java  @PV Pho Vu
 * Ask for a word and display it capital letters and in lower case letters.
 * #1 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package

public class PVLowerUpper { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter a word: "); // display request
        String enter = scanner.nextLine(); // read user's input
        System.out.println("Uppercase: " + enter.toUpperCase()); // output user's input in Uppercase
        System.out.println("Lowercase: " + enter.toLowerCase()); // output user's input in Lowercase
    } // end main
} // end class
