/** File: Week13/Lab13Sol/Programs0/PVStdDraw/PVBalloonDrawMouse.java @PV Pho Vu
 * Draw 6 balloon-like lollipops
 * Say hello to Pho's Lollipops <3
 * Use either StdDraw file or zipped stdlib.jar library in src file
 */

public class PVBalloonDrawMouse {//driver program
    public static void main(String[] args) { // start main
        Balloon [] Bs = new Balloon[6]; // customize numbers of lollipops, n = 6
        Bs[0]= new Balloon(30,150,40);
        Bs[1]= new Balloon(50,140,30);
        Bs[2]= new Balloon(150,190,70);
        Bs[3]= new Balloon(100,150,30);
        Bs[4]= new Balloon(260,180,50);
        Bs[5]= new Balloon(270,170,30);
        int width = 300; int height = 300;
        StdDraw.setCanvasSize(width,height); // change coordinate systems
        StdDraw.setScale(0,width); // set scale for canvas
        StdDraw.enableDoubleBuffering(); // use double-buffered drawing
        while(true){ // when given condition is satisfied
            StdDraw.clear(); // set new screen
            for (Balloon b : Bs) {
                if (StdDraw.isMousePressed()&& b.mouseInCircle()) b.click = true; //change status if clicked
                b.draw(); // draw the drawing
                StdDraw.setPenColor(255, 0, 0); // set pen color for text
                StdDraw.text(150,275, "Hello Pho's Lollipops <3"); // print customized text
            }//for
            StdDraw.show(); // display the drawing
            StdDraw.pause(20); // pause the drawing

        } // end while
    }// end main
}// end class
class Balloon { // initiate balloon
    int radius; // set circle's radius
    int x,y;//center
    int r, g, b; // red (r), green (g), blue (b)
    boolean click = false;//true if clicked
    Balloon(int x, int y, int radius) {
        this.x = x; this.y = y; this.radius = radius; this.r=r; this.g =g; this.b=b;}
    public void draw(){
        if ( ! click) {
            StdDraw.setPenColor(0, 255, 255); // RGB convention for TURQUOISE
            StdDraw.circle(x, y, radius);
            StdDraw.setPenColor(255, 0, 255); // RGB convention for PINK
            StdDraw.line(x, y - radius, x, y - 2 * radius);///thread
        } }//draw
    static double dist(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));}
    boolean mouseInCircle(){ // distance between mouse and center
        return (dist(x,y,StdDraw.mouseX(),StdDraw.mouseY()) < radius);
    }// end mouseInCircle
}// end class