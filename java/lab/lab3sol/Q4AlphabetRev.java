public class Q4AlphabetRev {
    public static void main(String[] args) {

        // using function alphaRev()
        alphaRev();
    }

    public static void alphaRev() {
        char ch;
        for (ch = 'Z'; ch >= 'A'; ch--) {
            System.out.println(ch + "" + Character.toLowerCase(ch) + " ");
        }
    }
}
