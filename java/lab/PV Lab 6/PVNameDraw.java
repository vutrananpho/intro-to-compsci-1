/** File: Lab6/PVsNameDraw.java    @PV Pho Vu
 * Writes name 3 times in the middle of the canvas in red, green, blue
 */
public class PVNameDraw { // start class
    public static void main(String[] args) { // start main
        int width = 700, height = 300; // use variables for canvas size
        int offset = 100; // spacing between words

        String name = "Pho"; // declare string variable with my own name
        StdDraw.setCanvasSize(width,height);//change coordinate system 300 x 300 pixels
        StdDraw.setXscale(0,width); // set scale for x-axis
        StdDraw.setYscale(0,height); // set scale for y-axis

        // (0,0) is the left-down corner like in Math!

        StdDraw.setPenColor(255,0, 0);	// RGB convention Red or StdDraw.RED
        StdDraw.text(width/2.0, height/2.0 + offset,name);// name on the top of the canvas

        StdDraw.setPenColor(0,255, 0);	// RGB convention Red or StdDraw.RED
        StdDraw.text(width/2.0, height/2.0,name);// name in the middle of the canvas

        StdDraw.setPenColor(0,0, 255);	// RGB convention Red or StdDraw.RED
        StdDraw.text(width/2.0, height/2.0 - offset,name);// name on the bottom of the canvas
    } //end main
} // end class

