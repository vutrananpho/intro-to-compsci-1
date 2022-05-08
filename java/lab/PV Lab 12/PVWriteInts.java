/** File: Week12/Lab12Sol/Files/PVDrawMagic.java @PV Pho Vu
 * Collect integers from the user till the user types 0 in a file called "myInts.txt"
 */

import java.io.*;  // import all functions from java.io package -- write/read in file
import java.util.*;  // import all functions from java.util package -- write/read in file

public class PVWriteInts { // start class -- driver program
    public static void main(String[] args) { // start main
        Scanner fin = null; // original condition
        try // try - catch
    { fin = new Scanner(new File("myInts.txt")); // read file
    }
		catch( Exception ex)
    {
        System.out.print(ex);
    }   System.out.println("Print from myInts.txt file:"); // display request
		while(fin.hasNext()) { //check if end of file
            int s = Integer.parseInt(fin.next()); // convert from integer to string
            if ( s == 0) { // read until 0
                break; // break from the cycle
            } // end if
            System.out.println(s); // print from file
        } // end while
    } // end main
} // end class
