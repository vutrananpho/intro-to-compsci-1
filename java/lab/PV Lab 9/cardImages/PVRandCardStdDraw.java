/** File:  Week9/Lab9Sol/Arrays(Cont)/PVDisplayCard.java @PV Pho Vu
 * Draw a random Card using StdDraw
 * SUITS: ace, king, queen, jack
*/

public class PVRandCardStdDraw { // start class
    public static void main(String[] args) { // start main
        int width = 300; // set integer value for width
        StdDraw.setCanvasSize(width,width);//change coordinate system 320 x 320
        StdDraw.setXscale(0,width); // set scale for x-axis
        StdDraw.setYscale(0,width); // set scale for y-axis
        String filename = findFilename(); // find a random card by calling findFilename()
        StdDraw.picture(width/2,width/2,filename); // set coordinates for the card file
        StdDraw.show(); // display the randomly generated card
    }// end main

    public static String findFilename() {// find a name for a random file with card images
        String [] RANKS = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};// n = 13
        String [] SUITS = {"hearts","diamonds","clubs","spades"};// n = 4
        int r = (int)(Math.random() * 13); // randomize cards
        int s = (int)(Math.random() * 4);  // Ex: "king_Of_hearts.png"
        String filename = "cardImages/" + RANKS[r] + "_of_" + SUITS[s] + ".png";
        return  filename; // return the card file
    }// end findFilename
} // end class
