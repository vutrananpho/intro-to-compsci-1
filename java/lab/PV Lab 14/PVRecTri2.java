/** File: Week14/Lab14Sol/PVRecTri2.java @PV Pho Vu
 * Needs StdDraw.class or stdlib.jar library in the same folder. 512-by-512 default canvas
 * https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
 * Sierpinski Recursive Triangle
 * Initial triangle is (x1,y1) (x2,y2) (x3,y3)
 * Divide each side in 2 and draw 3 triangles (there is also one in the middle)
 * Use rand256() to generate random colors
 */
public class PVRecTri2 { // start class
    public static void main(String[] args) { // start main
        int w = 460; // # how many times of recursion
        StdDraw.setCanvasSize(w,w); // change coordinate system
        StdDraw.setScale(0,w); //(0,0) is in the left- down corner like in Math
        doItAgain(0,0,0, w,w,0,3); // (0,0) diameter = 300; (0,0) (0,w) (w,0) n = 3
    } // end main

    public static void doItAgain(int x1, int y1, int x2, int y2, int x3, int y3, int n) {
        double[] X = {x1, x2, x3}; // set array for 3 coordinate points on x-axis
        double[] Y = {y1, y2, y3}; // set array for 3 coordinate points on y-axis
        StdDraw.setPenColor(rand256(),rand256(),rand256()); // call rand256()
        StdDraw.filledPolygon(X,Y); // draw & fill polygon
        if ( n > 1 ) { // after n loops
            doItAgain(x1, y1, (x1 + x2)/ 2, (y1 + y2)/ 2, (x1+x3)/2, (y1+y3)/2,n-1);
            doItAgain(x2, y2, (x1 + x2)/ 2, (y1 + y2)/ 2, (x2+x3)/2, (y2+y3)/2,n-1);
            doItAgain(x3, y3, (x2 + x3)/ 2, (y3 + y2)/ 2, (x1+x3)/2, (y1+y3)/2,n-1);
        }
    } // doItAgain
    static int rand256() { // (0,256) initiate rand256()
        return (int) (Math.random() * 256); // randomize colors
    } // rand256()

} // end class