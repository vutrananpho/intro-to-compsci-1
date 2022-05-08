/** File: Week4/Lab4Sol/String/StdDraw/PVDrawDiags.java @PV Pho Vu
 * Draw the diagonals
 * #12 in Lab
 */
public class PVDrawDiags { // start class
    public static void main(String[] args) { // start main
        StdDraw.setCanvasSize(300, 300); //change coordinate system 300 x 300 pixels
        StdDraw.setXscale(0, 300); // set scale for x-axis
        StdDraw.setYscale(0, 300); // set scale for y-axis

        StdDraw.setPenColor(255, 0, 0);    //RGB convention Red or StdDraw.RED
        StdDraw.line(0, 300, 300, 0);// 1st diagonal

        StdDraw.setPenColor(255, 255, 0); //RGB convention Yellow StdDraw.RED
        StdDraw.line(0, 0, 300, 300);//	2nd diagonal

        StdDraw.setPenColor(0, 0, 255);  //RGB convention Blue or StdDraw.BLUE
        StdDraw.line(0, 150, 300, 150); //(x1,y1,x2,y2)

        StdDraw.setPenColor(0, 0, 0);    //RGB convention Blue or StdDraw.BLACK
        StdDraw.text(150, 150, "Pho Vu's Diagonals"); // write some texts & my name
    } // main
} // class