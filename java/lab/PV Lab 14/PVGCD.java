/** File: Week14/Lab14Sol/Recursion/PVGCD.java  @PV Pho Vu
GCD Euclid's division algorithm  gcd = greatest common divisor
Euclid of Alexandria about (325 BC - 265 BC) is
the most prominent mathematician of antiquity, known for his treatise on mathematics: "The Elements".
Algorithm.    n/m quotient and
 r  remainder: r = n % m , % is called the modulo operation
	gcd(n,m) = m		if    r =  0
	gcd(n,m) = gcd(m,r)
Ex: gcd(1,1)= 1	gcd(9,132)= 3	gcd(89,78)=1
RUN:	
Enter two numbers?: 9000 78
9000 divided by 78 remainder= 30
78 divided by 30 remainder= 18
30 divided by 18 remainder= 12
18 divided by 12 remainder= 6
12 divided by 6 remainder= 0
gcd(9000,78 )= 6
	Bye
Enter two numbers?: 912345678	987654321
912345678 divided by 987654321 remainder= 912345678
987654321 divided by 912345678 remainder= 75308643
912345678 divided by 75308643 remainder= 8641962
75308643 divided by 8641962 remainder= 6172947
8641962 divided by 6172947 remainder= 2469015
6172947 divided by 2469015 remainder= 1234917
2469015 divided by 1234917 remainder= 1234098
1234917 divided by 1234098 remainder= 819
1234098 divided by 819 remainder= 684
819 divided by 684 remainder= 135
684 divided by 135 remainder= 9
135 divided by 9 remainder= 0
gcd(912345678,987654321 )= 9
gcdslow(912345678,987654321 )= 9
*/
import java.util.*; // import java function from java.util package
public class PVGCD { // start class
    public static void main (String [] args) { // start main
        Scanner in = new Scanner(System.in); // create a Scanner
        System.out.print("Greatest common divisor. Enter two ints n,m? ");
        int n = in.nextInt(), m = in.nextInt(); // create variables for reading user's input
        if ((n == 0) || (m == 0)) // condition
            System.out.println("wrong input"); // display result
        else { // start else
            System.out.println("gcd( " + n + "," + m + ")= " + gcd(n,m));
            System.out.println("\n gcdslow= " + gcdslow(n,m));
            System.out.println("\n gcdslow2= " + gcdslow2(n,m));
        } // end if-else
    } // end main

    static int gcd( int n, int m ) { // Euclid's algorithm
        int r = n % m;  // find r = remainder
        if ( r == 0 )
            return m;  // m divides n then m is gcd
        else
            return gcd(m,r);	// if not find gcd(m, rem(n,m))
    } // end gcd

    static int gcdslow(int n, int m) {
        int factor = 1;
        for (int i = 2 ; i <= m ; i++) {
            if ((m % i == 0) && (n % i == 0))
                factor = i;  // computes all factors
        }
        return factor; // the last (greatest) is selected
    } // end gcdslow

    static int gcdslow2 (int n, int m) {
        for (int i = m ; i >= 2 ; i--) {
            if ( m % i == 0  &&  n % i == 0)  return i;
        }
        return 1; // there is no common divisor
    }//gcdslow2

    int lcm (int n,int m) { // least common multiple
        return  ( n * m ) / gcd(n,m) ;
    }// end lcm

}// end class