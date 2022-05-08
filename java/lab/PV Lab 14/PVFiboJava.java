/** File: Week14/Lab14SolRecursion/PVFiboJava.java   Contest problem @PV Pho Vu
 Given a positive integer n > 0 write it as the sum of k numbers only from the
 Fibonacci sequence ( 1 1 2 3 5 8 13 21 34 55 89 ...)
 without repeats, k being the smallest possible.
 If n is already in the sequence you type just n.
 55 55
 456 3 21 55 377
 100 3 8 89
 98 1 8 89
 2018 2 8 34 377 1597
 123456 89 377 1597 121393
 1234567 2       5       13      89      233     2584    6765    75025   317811  832040
 12345678 1       4181    28657   75025   832040  2178309 9227465
 123456789 1 5 13 233 987 2584 46368 121393 317811 5702887 14930352 102334155
 */
import java.util.*; // import java function from java.util package
class PVFiboJava { // start class
    public static void main(String [] args) { // start main
        Scanner cin = new Scanner(System.in); // input integer from console
        int n = 1;   // my number
        while (n != 0) { // start while
            System.out.print("Enter n (0 - quit)? "); // display command
            n = cin.nextInt(); // nextInt(); tells the compiler the input is an integ
            if (n == 0 ) break;
            System.out.print(n + " ");
            if ( isfibo (n) ) System.out.println(n);
            else  findsum(n);
            System.out.println();
        } // end while
    } // end main
    static void findsum(int n) { // initialize findsum()
        int mm;
        if (n <= 0 ) return;
        if (isfibo(n)) System.out.print(n + " ");
        else { // start else
            mm = maxfibo(n);
            findsum(n-mm);
            System.out.print(mm + " ");
        } // end if-else
    } // find sum
    static boolean isfibo (int n) { // check if n is in the fibo sequence
        int i = 0;
        int ff;
        while (true) {
            ff = fib(i);
            if ( ff == n ) return true;
            if ( ff < n ) i++;
            if ( ff > n  ) return false;
        }
    } // is fib
    static int fib (int i){ //i pos in the sequence
        if ( i == 0 || i == 1 )
            return 1;
        else
            return (fib(i-1) + fib(i-2));
    } //fib
    static int maxfibo (int n) {/// check if n is in the fibo sequence
        int i = 0;
        int ff;
        while (true) { // when the given condition is satisfied
            ff = fib(i);
            if ( ff == n ) return n;
            if ( ff < n ) i++;
            if ( ff > n  ) return fib(i-1);
        } //
        //return 0;
    } // is fib
} // end class

