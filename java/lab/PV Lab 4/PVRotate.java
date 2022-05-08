/** File: Week4/Lab4Sol/Strings/PVRotate.java  @PV Pho Vu
 * Rotate a name, that generates all the circular permutations:
 Example: name ="dan"
 dan
 and
 nda
 * #12 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package

public class PVRotate { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        System.out.print("name = "); // ask for user's input
        String enter = scanner.nextLine(); // read user's input
        int enter1 = enter.length(); // count the length of input
        for (int i = 0; i < enter1; i++) { // for loop for all possibilities of names being rotated
            System.out.println(enter); // display input
            enter= enter.substring(1)+enter.charAt(0); // use the next letter as the first letter and remain the rest to complete the name
        } // end for
    } // end main
} // end class
