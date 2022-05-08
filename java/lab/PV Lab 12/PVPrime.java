/** File: Week12/Lab12Sol/Arithmetic/PVPrime.java @PV Pho Vu
 Test prime. Enter an integer? 987654321
 */
import java.util.*; // import all functions from java.util package
class PVPrime { // start class
    public static void main (String [] args) { // start main
        Scanner cin = new Scanner(System.in); // create a Scanner object
        System.out.print("Test prime. Please enter an integer: "); // display request for user's input
        int n = cin.nextInt(); // read user's input
        System.out.print("\nResult: " + (isprime0(n) ? "Prime!" : "NOT Prime")); // display result
    }// end main
    static boolean isprime (int x) { // initialize isprime
        if (x % 2 == 0) return false; // check if even
        for (int i = 3; i < Math.sqrt(x) ; i = i + 2) { // start for 1
            if (x % i == 0) return false; // found factor: Not prime
        } // end for 1
        return true; // factor not found
    } // end isprime
    static boolean isprime0 (int x) { // initialize isprime0 -- count list of factors
        int k = 0;     // # of factors
        System.out.println("List of factors is:\t");
        for (int i = 2; i < x ; i++) { // for loop for all factors listed
            if (x % i == 0)	{ // characteristics of prime numbers
                System.out.print( i + "\t"); // print out prime numbers
                k++; // count
            } // end if
        } // end for
        return  ((k == 0) ?  true : false); // return true/false
    } // end isprime0
} // end class