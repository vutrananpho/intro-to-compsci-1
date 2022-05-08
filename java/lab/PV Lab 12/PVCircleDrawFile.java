/** File: Week12/Lab12Sol/Files/PVCircleDrawFile.java @PV Pho Vu
We have a file Circle.txt:
 140 160 130
 130 260 50
 80 198 45
 170 130 30
 34 255 21
 Print "Hi! We are Pho Vu's Circle" in
 * #13 in Lab
 */
import java.io.*;  // import java function from java.io package -- for Files
import java.util.*; // import java function from java.util package
public class PVCircleDrawFile { // driver program
	static int n = 5; // size of the matrix = number of rows in txt file
	public static void main(String[] args) { // main method
		String filename = "PVCircles.txt"; // declare string variable for filename
		Scanner fin = null; // set original condition
		try  { fin = new Scanner(new File(filename)); } // implement try-catch
		catch (Exception ex) { System.out.print(ex); System.exit(1);}
		System.out.println("Reads:" + filename); // display the command
		myCircle [] A = new myCircle[n]; // set array
		for (int i = 0; i < n; i++){ // for loop for each row in Circle.txt
			int x = fin.nextInt();
			int y = fin.nextInt();
			int r = fin.nextInt();//radius
			A[i] = new myCircle(x,y,r); //System.out.println(A[i]);
		} // end for
		System.out.println(Arrays.toString(A)); // print arrays
		// prepare canvas
		int width = 400; // set width as 400
		StdDraw.setCanvasSize(width,width); // change coordinate systems into 400 x 400
		StdDraw.setXscale(0,width); // set scale for x-axis
		StdDraw.setYscale(0,width); // set scale for y-axis
		for (myCircle c : A) { // print from start to end
			c.drawCircle(); 
		} // end for
		fin.close();
	} // end main
} // end class Main
class myCircle { // initialize
	int x, y;	int radius; // set integer variables
	int z = 290; // set default integer value for z; z = 290
	myCircle(int x, int y, int radius) { this.x = x; this.y = y; this.radius = radius; }
	public String toString() { return "[" + x + "," + y + "]" + radius;} // display coordinate points and radius for each circle
	public void drawCircle(){ // function to draw circle
		StdDraw.setPenColor(0,0,255);// RGB convention for BLUE
		StdDraw.circle(x,y,radius); // setting for circle
		StdDraw.setPenColor(0,0,0); // RGB convention for BLACK
		StdDraw.text(z, z, "Hi! We are Pho Vu's Circles" );
    } // end drawCircle
} // end class myCircle
