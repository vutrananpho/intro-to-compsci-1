/** File: Week4/Lab4Sol/Strings/PVReverseName.java  @PV Pho Vu
 * Display your name reversed. Example: Mary becomes: yraM
 HINT:   for (int i = s.length()-1; i ≥ 0; i--) {
 			//print s.charAt(i)
 * #6 in Lab
 */

import java.util.Scanner; // import Scanner class from java.util package

public class PVReverseName { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter your name: "); // ask for user's input
        String name = scanner.nextLine(); // read user's input
        for (int i = name.length()-1; i >=0;i--) { // for loop for circular permutation
            System.out.print(name.charAt(i)); // display result
        } // end for
    } // end main
} // end class
