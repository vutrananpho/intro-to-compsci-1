/** File/Week2/Lab2Sol/Q10aleaCountDouble.java Author @PV Pho Vu
 ALEA exercise: Roll 2 dice n times. How many times you got a double?
 */
import java.util.Scanner;

public class Q10aleaCountDouble {
    public static void main(String[] args) {
        System.out.println("How many times do you want to roll? ");
        Scanner a = new Scanner(System.in);
        int times = a.nextInt();
        int d = 0;
        for (int i = 0; i < times; i++) {
            int face1 = (int) (Math.random()*6)+1;
            int face2 = (int) (Math.random()*6)+1;
            System.out.println("You rolled " + face1 + " and " + face2);
            if (face1 == face2) {
                d++;
            }
        }
        System.out.println("You've rolled a double for a total of " + d + " times.");
    }
}
