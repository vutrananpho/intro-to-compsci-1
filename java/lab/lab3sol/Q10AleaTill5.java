/** File/Week3/Lab3Sol/Q10AleaTill5.java Author @PV Pho Vu
 Dice. Roll 2 dice till first double. Count how many times you tried.
 */
public class Q10AleaTill5 {
    public static void main(String[] args) {
        int dice = (int)(Math.random()*6)+1;
        int count = 1;
        while (!(dice == 5 || dice == 6)) {
            System.out.println(count + ": You've got " + dice + ".");
            count++;
            dice = (int)(Math.random()*6)+1;
        }
        System.out.println(count + ": You've got " + dice + ".");
        System.out.println("You've tried " + count + " times.");
    }
}
