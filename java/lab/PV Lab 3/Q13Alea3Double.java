/** File/Week3/Lab3Sol/Q13Alea3Double.java Author @PV Pho Vu
 ALEA. Game Dice. Roll 3 dice until you have at least a double.
 */
public class Q13Alea3Double {
    public static void main(String[] args) {

        int dice1 = (int)(Math.random()*6)+1;
        int dice2 = (int)(Math.random()*6)+1;
        int dice3 = (int)(Math.random()*6)+1;

        int count = 1;

        while (!(dice1 == dice2 || dice2 == dice3 || dice1 == dice3)) {
            System.out.println(count + ": You've rolled " + dice1 + " and " + dice2 + " and " + dice3 + ".");
            count++;
            dice1 = (int)(Math.random()*6)+1;
            dice2 = (int)(Math.random()*6)+1;
            dice3 = (int)(Math.random()*6)+1;
        }
        System.out.println(count + ": You've rolled " + dice1 + " and " + dice2 + " and " + dice3 + ".");
        System.out.println("You've tried " + count + " times.");
    }
}
