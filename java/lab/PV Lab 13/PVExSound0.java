/** File:  Week13/Lab13Sol/PVExSound0.java @PV Pho Vu
 * You have 2 buttons red and green
 * If you click then the sounds will start: good (correct)  and bad (incorrect) :)
 * Need the StdAudio.java (compiled) in the same folder
 */
public class PVExSound0 { // start class PVExSound0
    public static void main(String[] args) { // start main
        int width = 320; int height = 320; // set integer values for width & height
        StdDraw.setCanvasSize( width,height);// change coordinate system 320 x 320
        StdDraw.setXscale(0,height); 		StdDraw.setYscale(0,width);
        Button sqred = new Button(80,100,40,255,0,0); // (xc,yc,d,red,green,blue)
        Button sqgreen = new Button(240,100,40,0,255,0); // (xc,yc,d,red,green,blue)
        String answer = "Click the squares :)";
        StdDraw.enableDoubleBuffering();//needed for animation
        while(true)  { // when the given condition is satisfied
            StdDraw.clear(); // new screen
            sqred.draw(); sqgreen.draw(); // draw buttons
            if (StdDraw.isMousePressed() ) { //wait if mouse pressed
                if (sqred.click(StdDraw.mouseX(), StdDraw.mouseY())) { // check location
                    answer = "Incorrect";
                    StdAudio.play("wrong.wav"); // play the audio file
                } // end if2
                else // else
                    if (sqgreen.click(StdDraw.mouseX(), StdDraw.mouseY())) { // check location
                        answer = "Correct";
                        StdAudio.play("correct.wav"); // play the audio file
                    } // end if3
            } // end if1
            StdDraw.setPenColor(0,0,0); // RBC convention for BLACK
            StdDraw.text(150,30, answer); // write text
            StdDraw.show(); // display the drawing
            StdDraw.pause(20); // pause the drawing
        } // end while
    } // end main
} // end class
class Button { 	//	call square button
    int x, y; 	//	(x,y) center
    int d;		//	half side of the square
    int r,g,b;	//	red (r), green (g) blue
    Button(int x,int y, int d, int r, int g, int b){
        this.x = x; this.y = y; this.d = d; this.r = r; this.g = g; this.b = b;}
    void draw(){ // initiate draw()
        StdDraw.setPenColor(r,g,b); // set color for rectangle
        StdDraw.filledRectangle(x,y,d,d); // set radius & location for rectangle
    }
    boolean click(double xm, double ym){ //if mouse is inside button
        return ( x - d < xm && xm < x + d && y - d < ym && ym < y + d ); }
} // end Button