/** File/Week3/Lab3Sol/Q1Alpha.java Author @PV Pho Vu
 * Display the English alphabet in upper case and their corresponding ASCII code
 */
public class Q1Alpha {
    public static void main(String[] args) {

        //printing alphabets in upper case
        printEnglishAlphabetInUpperCase();
    }

    public static void printEnglishAlphabetInUpperCase() {
        System.out.println("List of alphabets in upper case with their corresponding ASCII code: ");
        char ch;
        for (ch = 'A'; ch <='Z'; ch++) {
            System.out.println("The ASCII value of " + ch + " " + (int)ch);
        }
    }
}
