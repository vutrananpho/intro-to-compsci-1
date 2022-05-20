/** File/Week1/Lab1/Hello/PVPower2.java  @PV Pho Vu
 * Arithmetics. Basic Math Operations:  +,-,*, %,
 * Math.random(),Math.sqrt(n), Math.pow(n,e), System.out.println();
 */

public class PVPower2 { // start class
    public static void main(String[] args) { // start main
        int n = (int)Math.random() * 100; // assign value of 10 to variable n
        System.out.println("Generate random power: " + n); // display random power
        System.out.println("Two to the " + n + " power equals: " + Math.pow(2,n)); // display result of 2^n
    } // end main
} // end main