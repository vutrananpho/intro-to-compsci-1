/** File: Week14/Lab14Sol/Programs0/PVStdDraw/RecSquares.java @PV Pho Vu
 * Recursive squares
 * 222Initial square: (x1,y1) (x2,,y2) (x3,y3),(x4,y4)
 * Divide each side in 2 and draw smaller square
 * Use either file StdDraw class or zipped library stdlib.jar
*/
public class PVRecSquares{ // start PVRecSquares class
    public static void main(String[] args) { // start main
        int w = 500; // canvas is w x w a square
        String greetings = "Hi Pho!"; // set string variable for text
        StdDraw.setCanvasSize(w,w);//change coordinate system
        StdDraw.setScale(0,w); // set scale for canvas
        //(0,0) is in the left- down corner like in Math
        int  n = 5; //   # how many times recursion (5)
        doItAgain(0,0,w,0,w,w,0,w,n);//(0,0) (w,0) (w,w)(0,w)
        StdDraw.setPenColor(255,255,255); // RGB convention for WHITE
        StdDraw.text(w/2, w/2, greetings); // set coordinates & display text
    } // end main
    public static void doItAgain(int x1,int y1,int x2,int y2,int x3,int y3, int x4,int y4, int n) {
        double[] X = { x1, x2, x3, x4 }; // x-coordinates for polygons
        double[] Y = { y1, y2, y3, y4 }; // y-coordinates for polygons
        StdDraw.setPenColor(rand256(), rand256(), rand256());
        StdDraw.filledPolygon(X,Y);  // set radius and location for polygons)
        if  (n >= 1) { // after n loops
            doItAgain((x1+x2)/2,(y1+y2)/2,(x2+x3)/2,(y2+y3)/2,(x3+x4)/2,(y3+y4)/2,(x4+x1)/2,(y4+y1)/2,n-1);//
        } // end if
    }//doItAgain
    static int rand256() {// (0, 256))} // initiate rand256()
        return (int) (Math.random() * 256); // randomize colors for polygons
    } // end rand256()
}// end class


