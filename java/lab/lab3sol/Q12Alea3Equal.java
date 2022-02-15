/** File/Week3/Lab3Sol/Q12Alea3Equal.java Author @PV Pho Vu
 ALEA. Game Dice. Imagine a game. Roll 3 of dice until they are all equal.
 */
public class Q12Alea3Equal {
    public static void main(String[] args) {

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int dice3 = (int) (Math.random() * 6) + 1;

        int count = 0;

        while (!(dice1 == dice2 && dice2 == dice3)) {
            System.out.println(count + ": You've rolled " + dice1 + " and " + dice2 + " and " + dice3 + ".");
            count++;
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;
        }
        System.out.println("You've rolled " + dice1 + " and " + dice2 + " and " + dice3 + ".");
        System.out.println("You've tried " + count + " times.");


    }

}
