/** File: Week4/Lab4Sol/PVSameCharacter.java  @PV Pho Vu
 * Given two words check if they start with the same letter (disregarding case)
 * Ask for Continue(y/n)?
 Example: Enter 2 words? Mary mother
 Start with the same letter: true
 Continue(y/n)? y
 Enter 2 words? rain sun
 Start with the same letter: false
 Continue(y/n)? n
 * #4 in Lab
 */
import java.util.Scanner;
public class PVSameCharacter {
    public static void main(String[] args) {
        while (true) { // attempt to satisfy some conditions; boolean = true
            Scanner scanner = new Scanner(System.in); // create a Scanner object
            System.out.print("Enter 2 words? "); // ask for user's input
            String enter = scanner.nextLine(); // read user's input
            String[] words = enter.split(" "); // string split() method; break a string into 2 with space
            char c1 = words[0].charAt(0); // first letter of first word
            char c2 = words[1].charAt(0); // first letter of second word
            if (Character.toLowerCase(c1) == Character.toLowerCase(c2)) { // make all input lowercase for condition
                System.out.println("Start with the same letter: true"); // if two letters compared are the same, display true
                System.out.print("Continue(y/n)? "); // ask if user wants to continue or not
                char yesno = scanner.next().charAt(0); // create char variable that reads first letter only
                yesno = Character.toLowerCase(yesno); // make answer lowecase
                while (!(yesno == 'y' || yesno == 'n')) { // keep running if answer does not equal 'y' or 'n'
                    System.out.print("Invalid input. Continue(y/n)? ");
                    yesno = scanner.next().charAt(0); // read the first letter
                    yesno = Character.toLowerCase(yesno); // make answer lowercase
                } // end while 2
                if (yesno == 'n') { // in case answer is 'n' (no)
                    System.out.println("End game."); // display "End game" as a goodbye etiquette
                    return; // exit the method & end game
                } // end if 2
            } // end if 1
        } // end while 1
    } // end main
} // end class
