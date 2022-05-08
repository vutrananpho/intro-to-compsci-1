/**File: Week4/Lab4Sol/Strings/StdDraw/PVHorizontalNames.java @PV Pho Vu
 * StdDraw
 * Draw your name on the canvas n (int n = 5) times horizontally
 */

import java.util.*; // imporrtall util functions of Java
public class PVHorizontalNames {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(300,300); //change coordinate system
        StdDraw.setXscale(0,300); // set scale for x-axis
        StdDraw.setYscale(0,300); // set scale for y-axis
        Scanner cin = new Scanner(System.in); // create a Scanner object
        System.out.print("What's your name? "); // ask for user's name
        String name = cin.nextLine(); // read user's input
        int space = 40; //
        for (int i = 0; i < 5; i++) { // for loop for 5 times of names; int n = 5
            StdDraw.setPenColor(0, 0,  i * 45);    //RGB convention Blue
            StdDraw.text(75 + i * space, 150, name.toUpperCase()); // coordinates fpr middle of the text + display text
        }
    }//main
}//class