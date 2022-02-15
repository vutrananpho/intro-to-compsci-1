/** File/Week3/Lab3Sol/Q14AleaConsec3.java Author @PV Pho Vu
 Dice. Roll 2 dice till first double. Count how many times you tried.
 */
public class Q14AleaConsec3 {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;
        int dice3 = (int) (Math.random() * 6) + 1;
        System.out.println("You've rolled " + dice1 + " and " + dice2 + " and " + dice3 + ".");

        if (dice1 > dice2) {
            int a = dice1;
            dice1 = dice2;
            dice2 = a;
        }
        if (dice2 > dice3) {
            int a = dice2;
            dice2 = dice3;
            dice3 = a;
        }
        if (dice1 > dice2) {
            int a = dice1;
            dice1 = dice2;
            dice2 = a;
        }
        if (dice1 + 1 == dice2 && dice2 + 1 == dice3) {
            System.out.println("You've got consecutives.");
        } else {
            System.out.println("You've failed! They are not consecutives.");
        }
    }
}
