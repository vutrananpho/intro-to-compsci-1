/** File/Week1/Lab1/Hello/PVFahr2celsius.java @PV Pho Vu
 * Convert Fahrenheit degrees to Celsius and vice versa.
 * Assume you know double fahr = 70.0 Find double celsius = ?
 * Formula celsius = (fahr - 32.0) * 5 / 9.0;
 * #11 in Lab
 */
public class PVFahr2celsius { // start class
    public static void main(String[] args) { // start main
        double fahrenheit = 70; // set fahrenheit degrees to 70
        double celsius = ((fahrenheit - 32) * 5)/9; // formula
        double fahrenheit2 = ((celsius*9/5)+32); // formula w/ decimals
        System.out.println("Fahrenheit degree given: " + fahrenheit2); // display Fahrenheit degree
        System.out.println("70 Fahrenheit degree in Celsius is: " + celsius); // display the degree in celsius
    } // end main
} // end class
