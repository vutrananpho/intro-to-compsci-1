/** File/Week3/Lab3Sol/Q16LetterPosition.java Author @PV Pho Vu
 Dice. Roll 2 dice till first double. Count how many times you tried.
 */
import java.util.Scanner;

public class Q16LetterPosition {
    public static void main(String[] args) {

        System.out.print("Enter char? ");
        Scanner l = new Scanner(System.in);
        char letter = l.next().charAt(0);

        char letter2 = Character.toUpperCase(letter);
        int ch = (int) letter2;
        System.out.println(letter + " has position " + (ch - 64));
    }
}
