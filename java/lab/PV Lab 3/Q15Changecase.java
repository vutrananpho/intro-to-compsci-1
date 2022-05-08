/** File/Week3/Lab3Sol/Q15Changecase.java Author @PV Pho Vu
 Dice. Roll 2 dice till first double. Count how many times you tried.
 */
import java.util.Scanner;
public class Q15Changecase {
    public static void main(String[] args) {
        System.out.println("Type a letter: ");
        Scanner l = new Scanner(System.in);
        char letter = l.next().charAt(0);

        if (Character.isLowerCase(letter)) {
            System.out.println("UpperCase is: " + Character.toUpperCase(letter));
        } else {
            System.out.println("LowerCase is: " + Character.toLowerCase(letter));
        }
    }
}
