/** File: Week9/Lab9Sol/Arrays(Cont)/PVGridImages.java  @PV Pho Vu
* Place 5 x 5 images of random cards in a grid 400 x 400
*/
public class PVGridImages  {//driver program; start c
    public static void main (String args[]) { // start main
        MyCard aa = new MyCard();//computer-generated card
        MyCard mm = new MyCard();
        System.out.println(aa + "\t" + mm + "filename for x:" + aa.findFileName());
        int Width = 400; int Height = 400;//400 x200
        StdDraw.setCanvasSize(Width,Height);	//change coordinate system
        StdDraw.setXscale(0,Width); 		StdDraw.setYscale(0,Height);
        StdDraw.setPenColor(00,100,26);//surprise color
        StdDraw.filledRectangle(Width/2,Height/2,Width,Height);
        StdDraw.picture(Width/3,Height/2,aa.findFileName());
        StdDraw.picture(2 * Width/3,Height/2,mm.findFileName());
        String win = "lose";
        if (aa.rank.equals(mm.rank)) win = "winner";
        StdDraw.setPenColor(255,255,255);//surprise color
        StdDraw.text( Width/2, 30, win);
        StdDraw.show();
    }// end main
}// end driver
class MyCard {//my own data type
    static String [] RANKS = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};// n = 13
    static String [] SUITS = {"hearts","diamonds","clubs","spades"};// n = 4
    String rank, suit;
    MyCard () {
        rank = RANKS[(int) (Math.random() * 13)];
        suit = SUITS[(int) (Math.random() * 4)];
    }
    public String toString() { return rank + " of " + suit; }
    public String findFileName(){
        String filename = "cardImages/" + rank + "_of_" + suit + ".png";
        return  filename;
    }// end findFileName
}// end class