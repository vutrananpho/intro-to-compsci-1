/** File: Lab6/PVDrawDiagonals.java @PV Pho Vu
 * Draw diagonals in random colors. Use function for random color.
 */
public class PVDrawDiagonals { // start class
    public static void main(String[] args) { // start main
        int width = 600, height = 400; // set integer value for width and height
        StdDraw.setCanvasSize(width,height);//change coordinate system 300 x 300 pixels
        StdDraw.setXscale(0,width); // set scale for x-axis
        StdDraw.setYscale(0,height); // set scale for y-axis

        // (0,0) is the left-down corner like in Math!

        StdDraw.setPenColor(255,0, 0);	//RGB convention Red or StdDraw.RED
        StdDraw.line(0,height,width,0);// first diagonal

        StdDraw.setPenColor(255, 255, 0); //RGB convention Yellow StdDraw.RED
        StdDraw.line(0,0,width,height);//	second diagonal

        StdDraw.setPenColor(0,0,255);	//RGB convention Blue or StdDraw.BLUE
        StdDraw.text((width/2.0),(height/2.0),"Pho Vu's Diagonals"); // locate some texts with my name
        StdDraw.line(0,(height/2.0),width,(height/2.0)); //(x1,y1,x2,y2)
    } // end main
} // end class
