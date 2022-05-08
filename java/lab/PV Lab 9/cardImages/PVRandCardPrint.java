/** File: Week9/Lab9Sol/Arrays(Cont)/PVRandCardPrint.java @PV Pho Vu
 * OOP. Game of cards. Print a random card
 */
import java.util.*; // import all functions from java.util package
public class PVRandCardPrint {//driver program
    public static void main (String args[]) { // start main
        System.out.print("Card Faces:" + Card.Face);
        System.out.print("Card Suits:" + Card.Suit);
        Card X = new Card(); // call Card() to randomize cards
        Card Y = new Card(); // call Card() to randomize cards
        System.out.println("\nCards: " +  X +"\t"+ Y); // display
        Card [] Ashley = new Card[5]; // Hand give Ashley 5 cards
        for (int i = 0; i < 5; i++) { // for loop
            Ashley[i] = new Card();
        }
        System.out.println("Hand: " +  Arrays.toString(Ashley)); // display array
        System.out.println(Card.Face); // display
    } // end main
}// end class
class Card { // initialize Card()
    public static final String Face = "23456789TJQKA";	// Ace 2... 10 Jack Queen King
    public static final String Suit = "HDCS"; //Heart Diamond Club Spade
    char face; // 234..9TJQKA
    char suit; // H D C S

    public Card() {   // makes a random card by initializing Card()
        face = Face.charAt((int)(Math.random()* 13)); // randomize cards
        suit = Suit.charAt((int)(Math.random() * 4)); // randomize cards
    } // end Card
    public String toString() { // initialize toString
        return (face + "" + suit);
    } // end toString

}// end Card