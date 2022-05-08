/** File: Week5/Lab5Sol/Q1PVrandWord.java @PV Pho Vu
 Imagine a list of names of famous people, example: pascal, ada, babbage, boole, turing, leibniz.
 Display a random name.
 */
public class PVrandWord {

    static String randomName() {
        String[] names = {"pascal", "ada", "babbage", "boole", "turing", "leibniz" };
        int index = (int) (Math.random() * 6); // a random number from 0 to 5

        return names[index]; // element with order [index] in array names
    }

    public static void main(String[] args) {
        System.out.println(randomName());
    }
}
