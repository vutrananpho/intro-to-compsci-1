/** File/Week3/Lab3Sol/Q6CountA.java Author @PV Pho Vu
 * Generate n = 20 random upper case letters and report the number of A's and B's.
 */
import java.util.*; //read from console

public class Q6CountA {
    public static void main(String[] args) {

        int counta = 0;
        int countb = 0;

        for (int i = 0; i < 20; i++) {
            char c = (char)((int) (Math.random()*26)+65);
            System.out.println("You've got an " + c);
            if (c == 'A') {
                counta++;
            } else if (c == 'B') {
                countb++;
            }
        }
        System.out.println("You've got " + counta + " As. and " + countb + " Bs.");
    }
}
