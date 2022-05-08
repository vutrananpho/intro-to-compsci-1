/** File: Week9/Lab9Sol/Arrays(Cont)/PVGridCells   @PV Pho Vu
 * Divide a canvas 400 x 400 in 5 x 5 cells (the size of the cell will be 80).
 * Draw each cell in a random color.
 * Use StdDraw. Require stdlib.jar as library in src folder.
 */

import java.awt.*; // import all functions from java.awt package
import java.util.Random; // import random class from java.util package

public class PVGridCells { // start class
    public static void main(String[] args) { // start main
        int width = 800; //set width
        StdDraw.setCanvasSize(width, width); // change coordinate system
        StdDraw.setXscale(0, width); // set scale for x-axis
        StdDraw.setYscale(0,width); // set scale for y-axis

        int n = 5;
        int w = width/(n*2); // w is half size of the square
        cell [][] grid = new cell [n][n];
        for (int i = 0; i < n; i++) { // set grid's rows
            for (int j = 0; j < n; j++) { // set grid's columns
                grid [i][j] = new cell (i, j, w);
            } // end for 2
        } // end for 1

        // draw grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid [i][j].draw();
            }// end for 2
        } // end for 1
    }// end main
}// end class

class cell{ // initialize cell
    int i, j; // coordinate in the matrix
    int w; // size of cell
    int xcell,ycell; // center of the cell
    cell (int i, int j, int w) {
        this.i = i; this.j = j; this.w = w;
        xcell = w + i * 2 * w;
        ycell = w + j * 2 * w;
    } // end cell

    public void draw() { // initialize draw
        Random rnd = new Random(); // create new random variable "rnd"
        float r = rnd.nextFloat(); // random value for red
        float g = rnd.nextFloat(); // random value for green
        float b = rnd.nextFloat(); // random value for blue
        Color ranColor = new Color(r, g, b); // generate a random color
        StdDraw.setPenColor(ranColor); // randomize the pen color
        StdDraw.square(xcell, ycell, w); // draw cells in random pen colors
    } // end Draw
} // end class