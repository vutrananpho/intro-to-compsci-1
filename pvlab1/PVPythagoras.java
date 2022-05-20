/** File/Week1/Lab1/Hello/PVPythagoras.java  @PV Pho Vu
 * Find the hypotenuse a,  use a = Math.sqrt(b*b + c*c)
 * #12 in Lab
 */

public class PVPythagoras { // start class
    public static void main(String[] args) { // start main
        double b = 4, c = 3, a; // set decimal value for a, b, c in a triangle
        a = Math.sqrt(b * b + c * c); // formula for finding length of hypotenuse
        System.out.println("The length of the hypotenuse is: " + a); // display length of hypotenuse
    } // end main
} // end class
