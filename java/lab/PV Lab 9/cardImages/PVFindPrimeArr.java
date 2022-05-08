/** File: Week9/Lab9Sol/Arrays(Cont)/PVFindPrimeArr.java @PV Pho Vu
 * Find the first n primes. Add them to an array of primes.
 * Using Eratostene sieve
 * Check numbers only from the array.
 * First 10 primes: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
 */
import java.util.*; // import all functions from java.util package
    public class PVFindPrimeArr { // start class
        public static void main(String [] args) { // start main
            Scanner cin = new Scanner(System.in); // create a Scanner object
            System.out.print("Eratostene sieve. How many? "); // ask for user's input
            int n = cin.nextInt(); // read user's input
            int k = 0; //k keeps track of how many they are in the array
            int [] Era = new int [n]; // list of n primes. It is all zeros at the beginning
            Era[0] = 2;
            int i = 2;
            while (k < n-1){
                i++;//check next number
                if ( check(i,Era,k ) ) {
                    k++;
                    Era[k] = i;
                }
            }
            System.out.println("First " + n + " primes: " + Arrays.toString(Era));
        }// end main
        static boolean check (int p, int [] Era, int k){ // check p if prime by dividing with all in Era
            for (int j = 0; j < k; j++) { // divide only with primes from the list
                if ( p % Era[j] == 0 ) return false;
            } return true;
        }//check
    }//class
