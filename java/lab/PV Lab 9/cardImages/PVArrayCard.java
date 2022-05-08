/** File: Week9/Lab9Sol/Arrays(Cont)/PVArrayCard.java  @PV Pho Vu
 * Imagine a game of Cards where you generate random 5 cards in an array (a hand).
 * Then check if you have a pair (same face)?
 * Or three consecutive cards ( ex. 2 3 4 or ... 8 9 10)?
 * Or imagine something else.
 */
public class PVArrayCard { // start class
    public static void main(String[] args) { // start main
        Card aa = new Card(); // set new random card
        Card mm = new Card(); //random card
        System.out.println(aa + ", " + mm + ", filename for x: " + aa.findFileName());
        Card[] hand = new Card[5]; // array that consists of five cards
        for (int i = 0; i < 5; i++) { // for loop for five cards
            hand[i] = new Card();
        } // end for

        if (Card.wins(aa, mm) == true) { // check if two random cards are the same
            System.out.println("You win! The cards are the same!");
        } else { // if not the same
            System.out.println("You lose."); // display
        } // end if-else
    } // end main

    static class Card { // initialize Card
        static String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};// n = 13
        static String[] SUITS = {"hearts", "diamonds", "clubs", "spades"};// n = 4
        String rank;
        String suit;

        Card() { // apply card
            rank = RANKS[(int) (Math.random() * 13)];
            suit = SUITS[(int) (Math.random() * 4)];
        }

        public String toString() { // start toString
            return rank + " of " + suit;
        } // end toString

        public String findFileName() {
            String filename = "CardImages/" + rank + "_of_" + suit + ".png";
            return filename;
        } //end findFileName


        public static boolean wins(Card c1, Card c2) { // start wins
            if (c1.rank == c2.rank && c1.suit == c2.suit) {
            return true; // win
                } else {
                    return false;
                }
        } // end wins
    } // end card
} // end class
