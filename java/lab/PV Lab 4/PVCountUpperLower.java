/** File: Week4/Lab4Sol/Strings/PVCountUpperLower
 * Count the number of uppercase and lowercase letters in a name. Ask for name.
 * #10 in Lab
 */

import java.util.Scanner; // import Scanner class from java.util end class
public class PVCountUpperLower { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.println("Enter a name: "); // ask for user's input
        String name = scanner.next(); // read user's input

        int count1 = 0; // count # of UpperCase letters
        int count2 = 0; // count # of lowercase letters

        for (int i = 0; i < name.length(); i++) { // for loop through each letter of a given string
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)) { // check if there's UPPERCASE letter
                count1++; // count
            } // end if
            if (Character.isLowerCase(ch)) { // check if there's lowercase letter
                count2++; // count
            } // end if
        } // end for
        System.out.println("There are " + count1 + " uppercase letters."); // display # of UPPERCASE letters
        System.out.println("There are " + count2 + " lowercase letters."); // display # of lowercase letters
    } // end main
} // end class
