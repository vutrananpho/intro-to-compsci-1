/**File: Week9/Lab9Sol/Arrays(Cont)/PVGridLines.java @PV Pho Vu
 * Needs StdDraw.class in the same folder
 * >java GridLines.java
 * Divides the canvas in equal parts ny n lines: vertical and horizontal
 */
public class PVGridLines { // start class
    public static void main(String[] args) { // start main
        int Width = 300;  // canvas is squared Width = Height
        StdDraw.setCanvasSize(Width,Width);	//change coordinate system
        StdDraw.setScale(0,Width);
        int n = 3;
        int w = Width/n;
        StdDraw.setPenColor(StdDraw.PINK);// change color for lines if I wish
        for (int i = 0; i < n; i++) { // rows
            for (int j = 0; j < n; j++) { // columns
                StdDraw.line(i * w,0,i * w, Width);		//	vertical lines
                StdDraw.line(0,j * w, Width, j *  w);	//	horizontal lines
            } // end for
        } // end for
    } // end drawLines
} // end class