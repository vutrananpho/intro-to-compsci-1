/** File: Week4/Lab4Sol/Strings/PVCountBlanks.java  @PV Pho Vu
 * Write a program that takes a sentence and counts the blanks.
 * Enter sentence? I am very happy!
  	 #Blanks: 3
  HINT: Char ch = ' ';
    int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if ( ch == s.charAt(i)) result++;
        } //print result
 * #7 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package
public class PVCountBlanks { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create an Scanner object
        System.out.print("Enter sentence? "); // ask for user's input
        String input = scanner.nextLine(); // read user's input
        int count = 0; // declare variable for count
        for (int i = 0; i<input.length(); i++) { // for loop for every single letter in an inputted sentence
            char ch = input.charAt(i); // start from next position to the right in the round of loop
            if (Character.isWhitespace(ch)) { // if there is white space in between
                count++; // count
            } // end for
        } // end for
            System.out.println("#Blanks: " + count); // display number of blanks (if yes)
    } // end main
} // end class
