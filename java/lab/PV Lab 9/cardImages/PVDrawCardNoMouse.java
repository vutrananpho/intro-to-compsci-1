/** File: Week9/Lab9Sol/Arrays/PVDrawCardNoMouse.java @PV Pho VU
 * Draw a Card with Mouse use StdDraw ExCards/ExCard.java
 * You need to have the images in a folder called "cardImages" in src containing "2_of_clubs.png" .. "ace_of_clubs.png". Explore the files first.
 */
public class PVDrawCardNoMouse{ // start class
    public static void main(String[] args) { // start main
        int width = 300; // set integer value for width as 300
        StdDraw.setCanvasSize(width,width); //change coordinate system 320 x 320
        StdDraw.setXscale(0,width); // set scale for x-axis
        StdDraw.setYscale(0,width); // set scale for y-axis
        StdDraw.enableDoubleBuffering();//needed for animation
        String filename = "cardImages/queen_of_hearts.png"; //default card
            while(true)  {
                StdDraw.clear();// new screen
                StdDraw.picture(width/2,width/2,filename);
                if (StdDraw.isMousePressed() ) { //wait if mouse pressed
                    filename = findFilename();  //change the file(card)
                }
                StdDraw.show(); // display randomly-generated card
                StdDraw.pause(20); //
            } // end while
    } // end main

    public static String findFilename() {// find a name for a random file with card images
        String [] RANKS = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};// n = 13
        String [] SUITS = {"hearts","diamonds","clubs","spades"};// n = 4
        int r = (int)(Math.random() * 13); // randomize cards
        int s = (int)(Math.random() * 4);  // Ex: "king_Of_hearts.png"
        String filename = "cardImages/" + RANKS[r] + "_of_" + SUITS[s] + ".png";
        return  filename;
    } // end findFilename
} // end class
