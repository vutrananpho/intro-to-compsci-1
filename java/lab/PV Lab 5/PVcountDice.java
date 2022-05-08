/** File: Week5/Lab5Sol/Q2PVcountDice.java @PV Pho Vu
 *
 */
public class PVcountDice {
    public static void main(String[] args) {

        int[] count = new int[6];
        for (int i = 0; i < 10; i++) {
            int dice = (int) (Math.random() * 6) + 1;
            count[dice - 1]++;
        }
        for (int dice = 1; dice < 6; dice++) {
            System.out.println("You rolled " + dice + " for " + count[dice - 1] + ".");
        }
    }
}
