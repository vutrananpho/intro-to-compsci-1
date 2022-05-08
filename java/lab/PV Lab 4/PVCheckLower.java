/** File: Week4/Lab4Sol/Strings/PVCheckLower.java @PV Pho Vu
 * Enter a word and check if it has only lowercase letters:
 Example: Enter word? Ann
 Only lower case letters: false
 * #5 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package
public class PVCheckLower { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter word? "); // ask for user's input
        String input = scanner.nextLine(); // read user's input
        if (input != input.toLowerCase()) { // when uppercase letter is detected
            System.out.println("Only lower case letters: false"); // display "false"
        } else{ // when input includes all lowerrcase letters
            System.out.println("Only lower case letters: true"); // display "true"
        } // end if-else statement
    } // end main
} // end class
