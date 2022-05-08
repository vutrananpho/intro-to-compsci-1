/** File: Week4/Lab4Sol/Strings/PVFrequency.java @PV Pho Vu
 * Ask for a sentence in lowercase and report the frequencies of all its letters.
 Example.Enter sentence? amore more ore re
 a 1 m 2 o 3 r 4 e 5
 * #13 in Lab
 */
import java.util.*; // importa all util functions in Java
public class PVFrequency { // start class (public)
    public static void main (String[] args) { // start main
        Scanner cin = new Scanner(System.in); // create a Scanner object
        String s;   // the word
        char let;  // letter we count in word S
        String ans = "y"; //answer
        do { // do-while statement: run lines below until the end and check conditions in the 2nd round
            System.out.print("Enter a word? "); // ask for user's input
            s = cin.nextLine();// read user's input
            System.out.print("Count what letter?  "); // ask for user's request
            let = cin.nextLine().charAt(0); // read user's input (only first letter of what the user types in)
            System.out.println("Number of " + let + ": "+ countLet(let,s)); // display number of requested letter
            System.out.print("Continue(y/n)? "); // ask for user's permission to continue the game
            ans = cin.nextLine(); // read user's input
        } while (ans.equals("y") || ans.equals("Y")); // condition for next round of loop
    } // end main
    static int countLet (char ch, String s) { // call a sub-function
        int sum = 0; // declare a variable to count
        for (int i = 0; i < s.length(); i++) { // for loop to go through all existence of the requested letter
            if ( ch == s.charAt(i)) sum++; // count the requested letter
        } return sum; // return the result
    } // countLet
}// end class
