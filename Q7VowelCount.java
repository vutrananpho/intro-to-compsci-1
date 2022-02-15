/** File/Week3/Lab3Sol/QVowelCount.java Author @PV Pho Vu
 Generate 10 random letters in uppercase and count the vowels.
 */
import java.util.*; // read from console

public class Q7VowelCount {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;

        for (int i = 0; i < 10; i++) {
            char c = (char) (r.nextInt(26) + 'A');
            System.out.println("letter " + c);
            if (c == 'A' || c == 'E' || c == 'I'
                    || c == 'U' || c == 'O') {
                count++;
            }
        }
        System.out.println("You've got a vowel for " + count + " times.");
    }
}
