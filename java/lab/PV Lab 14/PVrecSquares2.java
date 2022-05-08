/** File: Recursion/PVrecSquares.java  From CCSCNE contest 2019 @PV Pho Vu
 * Begin with a square and each time inscribe inside another square
  using the midpoints of the sides of the bigger square.
 * We can do this forever.
 * Your program should print the sides of each square and stop
  when the area of the smallest square is <= 5.
 * The program should also print how many squares we can possibly obtain
  until the above condition is fulfilled.
 * Enter side of initial square? 17
 n = 17
 n = 12.0208
 n = 8.5
 n = 6.01041
 n = 4.25
 n = 3.0052
 n = 2.125
 How many shapes ? n = 7
 */
import java.util.*; // import java functions from java.util package
class PVrecSquares2 { // start class
    public static void main(String[] args) { // start main
        String ans = "y"; // create variable for answer
        do { // do-while
            Scanner in = new Scanner(System.in); // create a Scanner object
            System.out.print("Enter side of initial square? "); // how long is the square's side?
            double n = in.nextDouble(); // read from user's input
            romb(n,0); // counter k starts from 0
            System.out.print("Continue(y/n)? "); // continue? yes(y)/no(n)?
            Scanner cin = new Scanner(System.in); // create a Scanner object
            ans = cin.nextLine(); // read from user's input
        } while (ans.equals("y") || ans.equals("Y"));
        System.out.println("Bye!");
    } // end main

    static void romb (double n, int k) { // n = side k= how many squares
        System.out.println("area= " + n * n); // print the square's area
        if ( n * n <= 5 ) // if-else
            System.out.println("many squares=" +  k);
        else {
            romb(n * Math.sqrt(2)/2, k+1);
        } // end if-else
    } // end romb
} // end class;