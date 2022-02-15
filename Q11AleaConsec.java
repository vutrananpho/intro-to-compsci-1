/** File/Week3/Lab3Sol/Q11AleaConsec.java Author @PV Pho Vu
 Dice. Roll 2 dice till first double. Count how many times you tried.
 */
public class Q11AleaConsec {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 0; i < 10; i++) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            System.out.println(count + ": You've rolled " + dice1 + " and " + dice2);
            if (dice1 + 1 == dice2 || dice2 + 1 == dice1) {
                count++;
            }
        }
        System.out.println("You've got " + count + " consecutives.");
    }
}
