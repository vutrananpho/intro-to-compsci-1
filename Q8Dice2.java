/** File/Week3/Lab3Sol/Q8Dice2.java Author @PV Pho Vu
 Dice. Roll 2 dice till first double. Count how many times you tried.
 */
public class Q8Dice2 {
    public static void main(String[] args) {
        int dice1 = (int)(Math.random()*6)+1;
        int dice2 = (int)(Math.random()*6)+1;
        int count = 1;
        while (!(dice1 == dice2) ) {
            System.out.println(count + " : You've got " + dice1 + " and " + dice2 + ".");
            count++;
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
        }
        System.out.println(count + " : You've got " + dice1 + " and " + dice2);
        System.out.println("You've tried " + count + " times.");
    }
}