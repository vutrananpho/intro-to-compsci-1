/** File:  Week9/Lab9Sol/Arrays(Cont)/PVDisplayCard.java @PV Pho Vu
 * Display an Image on the canvas (the image of a card)
 * Display a card of my choice: King of Diamonds
 * See cardImages in Google Drive week9
 */
public class PVDisplayCard { // start class
    public static void main(String[] args) { // start main
        int width = 300; // set integer value for width
        StdDraw.setCanvasSize(width,width); // change coordinate system to 300 x 300
        StdDraw.setXscale(0,width); // set scale for x-axis
        StdDraw.setYscale(0,width); // set scale for y-axis

        String filename = "king_of_diamonds.png"; // specify a card of my choice

        StdDraw.picture(width/2,width/2,filename); //set coordinates of the card on canvas
        StdDraw.show(); // display card
    }//main
}//class
