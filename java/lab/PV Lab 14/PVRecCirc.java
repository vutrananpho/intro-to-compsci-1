/** File: Week14/Lab14Sol/PVRecCirc.java @PV Pho Vu
 * Needs StdDraw.class or stdlib.jar library in the same folder.
 * Fill the entire screen with circles
 */
public class PVRecCirc { // start class
    public static void main(String[] args) { // start main
        int w = 460; // canvas is w x w a square
        StdDraw.setCanvasSize(w,w); // change coordinate system
        StdDraw.setScale(0,w); // (0,0) is in the left- down corner like in Math
        doItAgain(w/2, w/2,200); // (0,0) diameter = 300
    } // end main

    public static void doItAgain(int x, int y, int r) { // initiate doItAgain
        StdDraw.setPenColor((int)(Math.random()*255), (int)(Math.random()*255), (int) (Math.random()*255)); //
        StdDraw.circle(x,y,r); // draw circle
        if (r<10) return;
        else { //
            doItAgain(x - r, y, r / 2); // left
            doItAgain(x + r, y, r / 2); // right
            doItAgain(x, y + r, r / 2); // up
            doItAgain(x, y - r, r / 2); // down
        } // end else
    } // end doItAgain

    static int rand256() { // (0,256) initiate rand256()
        return (int) (Math.random()*256); // randomize colors
    } // end rand256()

} // end class
