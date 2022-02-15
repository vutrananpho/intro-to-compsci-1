/** File/Week3/Lab3Sol/Q2AlphaLower.java Author @PV Pho Vu
 * Display the English alphabet in upper case and their corresponding ASCII code
 */
public class Q2AlphaLower {
    public static void main(String[] args) {

        //printing characters in lower case
        printEnglishAlphabetinLowerCase();
    }
        public static void printEnglishAlphabetinLowerCase() {
            System.out.println("List of alphabets in upper case with their corresponding ASCII code: ");
            char ch;
            for (ch = 'a' ; ch <= 'z' ; ch++) {
                System.out.println("the ASCII value of " + ch + " " + (int) ch);
            }
        }
}
