/** File: Week4/Lab4Sol/Strings/PVPasswordCheck.java  @PV Pho Vu
 * Password check. The password is Ann1.
 * The Program will ask you for your password until it gets it.
 Ex: pwd? mary
 pwd? joan
 pwd? Ann1
 Bye!
 * #2 in Lab
 */
import java.util.Scanner; // import Scanner class from java.util package

public class PVPasswordCheck { // start class
    public static void main(String[] args) { // start main
        Scanner scanner = new Scanner(System.in); // create a Scanner object
        while (true) { // attempt to satisfy some conditions
        System.out.print("pwd? "); // ask for user's input
        String input = scanner.nextLine(); // read user's input
            if (input.equals("Ann1")) { // condition when user inputs "Ann1"
                System.out.println("Bye!"); // display "Bye!"
                return; // exit the method
            } // end if
        } // end while
    } // end main
} // end class
