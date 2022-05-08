/** File:  Week13/Lab13Sol/PVStdDraw/PVExSoundCircle/PVExSoundCircle0.java @PV Pho Vu
 * If you click then the sounds will start: wrong.wav
 * Need the StdAudio.java (compiled) in the same folder
 */
public class PVExSoundCircle0 { // start class
    public static void main(String[] args) { // start main
		int width = 320; int height = 320; // set integer value for width & height
		StdDraw.setCanvasSize(width, height);//change coordinate system 320 x 320
		StdDraw.setXscale(0, width); // set scale for x-axis
		StdDraw.setYscale(0, height); // set scale for y-axis
		Circle br = new Circle(80, 100, 40, 20, 20, 20); //(xc,yc,d, r, g, b)
		String say = "Click the circle"; // display text (command)
		StdDraw.enableDoubleBuffering(); // needed for animation
		while (true) { // when the given condition is satisfied
			StdDraw.clear(); // set new screen
			br.draw(); // draw buttons
			if (StdDraw.isMousePressed() && br.mouseInCircle()) { // wait if mouse pressed
				say = "Wrong";
				StdAudio.play("wrong.wav");
				StdDraw.setPenColor(255,0,0); // set color for circle)
				StdDraw.filledCircle(80, 100, 40); // set radius & location for circle
			} // end if
			StdDraw.text(150, 30, say); //write text
			StdDraw.show(); // display the drawing
			StdDraw.pause(20); // pause for a few second
		} // end while
	} // end main
} // end class
class Circle { 	//	square button
	int x, y; 	//	(x,y) center
	int d;		//	radius
	int r,g,b;	//	red (r), green (g), blue (b)
	boolean click = false; // true if clicked
	Circle (int x,int y, int d, int r, int g, int b){ // initiate Circle()
		this.x = x; this.y = y; this.d = d; this.r = r; this.g = g; this.b = b;
	} // end Circle()
	public void draw(){ // initiate draw()
		StdDraw.setPenColor(r, g, b); // set color for ellipse w/ RGB
		StdDraw.filledEllipse(x,y,d,d); // set radius & location for ellipse
	} // end draw()
	public boolean mouseInCircle(){ // if mouse is inside button, initiate mouseInCircle()
		return (dist(x,y,StdDraw.mouseX(),StdDraw.mouseY()) < r);
	} // end mouseInCircle()
	static double dist(double x1,double y1,double x2,double y2) { // initiate dist()
		return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
	} // end dist()
} // end circle

