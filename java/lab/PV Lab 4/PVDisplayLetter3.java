/** File: Week4/Lab4Sol/Strings/PVDisplayLetter3.java  @PV Pho Vu
 * Display each letter 3 times.
 Example: Name? Dan Output: DDDaaannn
 * #8 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package

public class PVDisplayLetter3 { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.println("Name? "); // ask for user's input
        String name = scanner.nextLine(); // read user's input
        int count = name.length(); // measure the length of input

        for (int i = 0; i <name.length();i++) { // for loop for printing letters x3 times through looping
            System.out.print(name.charAt(i)); // display the letter
            System.out.print(name.charAt(i)); // display the letter
            System.out.print(name.charAt(i)); // display the letter
        } // end for
    } // end main
} // end class
