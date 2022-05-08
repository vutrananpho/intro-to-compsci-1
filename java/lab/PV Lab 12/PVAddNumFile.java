/** File: Week12/Lab12Sol/Files/AddNumbers/PVPrime.java @PV Pho Vu
 Adds integers from file "PVInts.txt"
 1
 2
 3
 4
 5
 # Numbers: 5 Sum: 15
 */
import java.io.*;  // import all functions from java.io package -- write/read in file
import java.util.*; // import all functions from java.util package
class PVAddNumFile { // start class -- driver program
    public static void main (String[] args) { // start main
        Scanner fin = null;
        try { fin = new Scanner(new File("PVInts.txt")); }
        catch (Exception ex) { System.out.println(ex); System.exit(1); }//catch
        int count = 0; // counts how many ints
        int sum = 0;   // their sum
        while ( fin.hasNext() ){
            int k = fin.nextInt(); // make sure it is an int!
            System.out.println(k); // also display to check
            count++; 		// counts how many int
            sum = sum + k;   // calculate sum
        }
        fin.close();
        System.out.print("# Numbers: " + count + " Sum: "+ sum ); // display n
    } // end main
} // end class
