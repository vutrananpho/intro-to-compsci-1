/** File/Week2/Lab2Sol/Q7Dice1.java Author @PV Pho Vu
 ALEA exercise: Roll a die n times. Display the results.
 */
import java.util.Scanner;

public class Q7Dice1 {

    public static void main(String[] args) {
        Scanner dice = new Scanner(System.in);
        System.out.println("How many times do you want to roll the dice? ");
        int d = dice.nextInt();
        for (int i = 0; i < d; i++) {
            int number = (int)(Math.random()*6)+1;
            System.out.print(number + " ");
        }
    }
}
