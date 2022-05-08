/** File: Recursive/PVPower.java @PV Pho Vu
 Power. Recursive and iterative approaches.
 Java: double Math.pow(double base,double exponent)
 Definition:			a^0 = 1
 a^n = a * a^(n-1)
 Enter an number (base)? 4
 Enter exponent? 6
 Recursive: 4.0^6 = 4096.0
 Iterative: 4.0^6 = 4096.0
 */
import java.util.*; // import java functions from java.util package
class PVPower { // start class
    public static void main (String [] args) { // start main
        Scanner cin = new Scanner(System.in); // create a Scanner object
        System.out.print("Enter an number (base)? "); // display #1
        float b = cin.nextFloat(); // read from user's import
        System.out.print("Enter exponent? "); // display request #2
        int n = cin.nextInt(); // read from user's import
        System.out.println("Recursive: " + b + "^" + n + " = " + powerRec(b,n));
        System.out.println("Iterative: " + b + "^" + n + " = " + powerIt(b,n));
    } // end main

    static float powerRec ( float a, int n ) { // start
        if (n == 0)
            return 1;
        else
            return (a * powerRec (a, n-1)) ;
    } // end powerRec

    static float powerIt ( float a, int n ) {
        float res = 1;
        for (int i = 0 ; i < n ; i++) { // n loop
            res = res * a ;
        }
        return res;
    } // end powerIt
} // end class