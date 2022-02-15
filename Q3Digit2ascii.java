/** File/Week3/Lab3Sol/Q3Digit2ascii.java Author @PV Pho Vu
 * Display the English alphabet in upper case and their corresponding ASCII code
 */
public class Q3Digit2ascii {
    public static void main(String[] args) {

        //printing characters in lower case
        printdigitascii();
    }
    public static void printdigitascii() {
        System.out.println("Display the ASCII code for all digits: ");
        char ch;
        for (ch = '0' ; ch <= '9' ; ch++) {
            System.out.println("the ASCII value of " + ch + " " + (int) ch);
        }
    }
}
