/** File: Week12/Lab12Sol/Files/PVDrawMagic.java @PV Pho Vu
 * Draw Albrecht Durer (1471 � 1528)� Melancholia. in file Magic.txt
 7 3 2 1
 4 1 19 99
 25 9 202 0
 3 4 20 21
 * #13 in Lab
 */
import java.util.*; // import all functions from java.util package
import java.io.*; // import all functions from java.io package
class PVDrawMagic { // start class -- driver program
	static int n = 4; // size of matrix in filename (PVMagic.txt)
	public static void main(String [] args){ // main method
		int [][]M = new int [n][n];
		String filename = "PVMagic.txt"; // declare String variable for filename
		Scanner fin = null;
		try  { fin = new Scanner(new File(filename)); } 
		catch (Exception ex) { System.out.print(ex); System.exit(1);}
		System.out.println("Reads:" + filename); 
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n ; j++){
			M[i][j] = fin.nextInt(); //System.out.println(M[i][j]);
		}}
		print(M); 
		System.out.println("number:" + magicNumber(M));
		drawCanvas(M);
	}
	static void drawCanvas(int M[][]){ // initialize drawCanvas
		int Width = 320; // set integer value for width as 320
		StdDraw.setCanvasSize(Width,Width); StdDraw.setScale(0,Width); 
		int sizeSq = 320/n; // n = 4 that is square size = 80
		for (int i = 0; i < n; i++) {
			for (int j = 0 ; j < n; j++){
				double x = sizeSq/2 + i * sizeSq;
				double y = sizeSq/2 + (n-1-j) * sizeSq;
				StdDraw.setPenColor(0,255,0); // RGB convention for GREEN
				StdDraw.square(x, y, sizeSq/2); // draw square 1
				StdDraw.square(x, y, sizeSq/2-3); // draw square 2
				StdDraw.square(x, y, sizeSq/2-2); // draw square 3
				StdDraw.setPenColor(0,0,255); // RGB convention for BLUE
				StdDraw.text(x, y,M[j][i] + ""); // write text
		}
	}}//drawCanvas
	static int magicNumber(int [][]M) { // initialize magicNumber
		int sum = 0;
		for (int i = 0; i < n ; i++) {
			sum = sum + M[i][0];
		} return sum;
	}//magicNumber
	static void print (int [][]M) { // initialize print
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n ; j++){
				System.out.print(M[i][j] + " ");
			}System.out.println();}
	} // end print
} // end class