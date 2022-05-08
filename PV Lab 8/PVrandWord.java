/** File: Week8/Lab8Sol/Arrays/PVrandWord.java @PV Pho Vu
 * Imagine an array of names of famous people, example: pascal, ada, babbage, boole, turing, leibniz.
 * Display a random name.
 * Ask if you wish to "Continue(y/n)?".
 * #5 in Lab
 */

public class PVrandWord { // start class
    public static void main(String[] args) { // start main
        String [] A = {"pascal", "ada", "babbage", "boole", "turing", "leibniz"}; // array of celebrities' names
        System.out.println("Randomize a name: " + Randomize(A));
    } // end main

    static String Randomize(String [] A) { // initialize Randomize
        int rand = (int) (Math.random() * A.length);
        return A[rand];
    } // end pickRandom
} // end class