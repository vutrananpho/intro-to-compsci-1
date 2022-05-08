/** File/Week1/Lab1/Hello/PVSqrt.java @PV Pho Vu
 * Display square root of an integer between 0 and 1000
 * 0 < c < 1000
 * #6 in Lab
 */

public class PVSqrt { // start class
    public static void main(String[] args) { // start main
        int c = (int) Math.random() * 1000; // randomize integer values
        System.out.println("Random integer generated: " + c); // display randomly-generated number
        System.out.println("Square root of c equals: " + Math.sqrt(c)); // display the number's square root
    } // end main
} // end