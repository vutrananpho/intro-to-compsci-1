/**File: Week4/Lab4Sol/Strings/StdDraw/PVHorizontalNames.java @PV Pho Vu
 * StdDraw
 * Draw your name on the canvas n (int n = 5) times horizontally
 */
import java.util.*; // import all util functions in Java
public class PVVerticalNames { // start class
    public static void main(String[] args) { // start main
        StdDraw.setCanvasSize(300,300);//change coordinate system
        StdDraw.setXscale(0,300); // set scale for x-axis
        StdDraw.setYscale(0,300); // set scale for x-axis
        Scanner cin = new Scanner(System.in); // create a Scanner object
        System.out.print("What's your name? "); // ask for user's name
        String name = cin.nextLine(); // read user's input
        int space = 30; // spacing
        for (int i = 0; i < 5; i++) { // for loop for 5 names; int n = 5
            StdDraw.setPenColor(0, 0,  i * 45);    //RGB convention Blue
            StdDraw.text(150, 120 + i * space, name.toUpperCase()); // coordinates for middle of the text + display text
        } // end for
    } // end main
} // end class