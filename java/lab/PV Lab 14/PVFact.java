/** File: Recursion/PVFact.java @PV Pho Vu
 Factorial n! Asks for n in N (natural number)
 n! = 1 * 2 * 3 * .. * n
 n in N		0! = 1
 n! = n * (n - 1)!
 4! =  24
 */
import java.util.*; // import java functions from java.util package
class PVFact { // start class
    public static void main (String [] args) { // start main
        Scanner cin = new Scanner(System.in); // create a Scanner object
        System.out.print("n! Enter n? "); // display request
        int n = cin.nextInt(); // read from user's input
        int res = 1; // result
        for ( int i = 1; i <= n; i++ ) { // start for
            res = res * i;  // same as   result  *= i;
        } // end for
    } // end main
} // end class
   