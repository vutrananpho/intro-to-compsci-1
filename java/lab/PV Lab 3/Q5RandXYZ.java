/** File/Week3/Lab3Sol/Q5RandXYZ.java Author @PV Pho Vu
 * Generate n = 20 random upper case letters and report the number of A's and B's.
 */
public class Q5RandXYZ {
    public static void main(String[] args) {

        // Writing random upper case letters
        randUpper();
    }
    public static void randUpper() {
        int dice = (int)(Math.random()*26)+65;
        System.out.println(dice);

        char ch = (char)dice;
        System.out.println(ch);
    }
}
