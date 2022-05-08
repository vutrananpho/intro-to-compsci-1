/** File PVVerticalLines.java  @PV Pho Vu
 * Draw n (random between 2 and 10) vertical lines equal distance.
 */

public class PVVerticalLines { // start class
    public static void main(String[] args) { // start main
        StdDraw.setCanvasSize(300,300); //
        StdDraw.setXscale(0, 300); //
        StdDraw.setYscale(0, 300); //

        for (int i = 0; i < 6; i++) { // for loop for lines to be prints
            System.out.println(i * (300 / 6)); // display x-coordinate points of each line
            StdDraw.line(i * (300 / 6), 0, i * (300 / 6), 300); // display lines over six equal parts
        } // end for
    } //main
} //class