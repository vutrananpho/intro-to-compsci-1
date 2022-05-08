/** File:   Recursion/PVCountRec.java @PV Pho Vu
 Count till n. Recursive.
 10 9 8 7 6 5 4 3 2 1
 1 2 3 4 5 6 7 8 9 10
 */
class PVCountRec { // start class
    public static void main(String [] args){
        int n = 10; // start point
        countback(n); // count backwards
        System.out.println(); // print backwards line of number
        mycount(n); //
    } // end main
    static void countback ( int n ) { // initiate countback()
        if (n == 0)	return;
        else {
            System.out.print( n + " ");
            countback(n-1);
        } // end if-else 1 statement
    } // end countback

    static void mycount ( int n ) { // initiate mycount()
        if (n == 0) return;
        else {
            mycount(n-1);
            System.out.print(n + " ");
        } // end if-else 2 statement
    } // end mycount
} // end class