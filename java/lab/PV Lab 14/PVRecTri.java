/** File: Week14/Lab14Sol/PVRecTri.java @PV Pho Vu
 * Needs StdDraw.class in the same folder.	512-by-512 default canvas
 * https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
 * Sierpinski Recursive Triangle
 * Initial triangle is (x1,y1) (x2,y2) (x3,y3)
 * Divide each side in 2 and draw 3 triangles (there is also one in the middle)
 */
public class PVRecTri { // start class
    public static void main(String[] args) { // start main
        int w = 460; // canvas is w x w a square
        StdDraw.setCanvasSize(w,w); // change coordinate system
        StdDraw.setScale(0,w); //(0,0) is in the left- down corner like in Math
        doItAgain(300,150,320, 350,50,290,3); //(300,150) (320,350) (50,290) (n)
    } // end main

    public static void doItAgain(int x1, int y1, int x2, int y2, int x3, int y3, int n) { // start doItAgain
        double[] X = {x1, x2, x3}; // set array for 3 coordinate points on x-axis
        double[] Y = {y1, y2, y3}; // set array for 3 coordinate points on y-axis
        StdDraw.setPenColor((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)); // randomize colors w/ Math random
        StdDraw.filledPolygon(X,Y); // triangle
        if ( n > 1 ) { // after n loops
            doItAgain(x1, y1, (x1 + x2)/ 2, (y1 + y2)/ 2, (x1+x3)/2, (y1+y3)/2,n-1);
            doItAgain(x2, y2, (x1 + x2)/ 2, (y1 + y2)/ 2, (x2+x3)/2, (y2+y3)/2,n-1);
            doItAgain(x3, y3, (x2 + x3)/ 2, (y3 + y2)/ 2, (x1+x3)/2, (y1+y3)/2,n-1);
        } // end if
    } // end doItAgain
} // end class