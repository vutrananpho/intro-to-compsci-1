import java.util.Scanner;

public class Q8aleaCount1_6 {
    public static void main(String[] args) {
        System.out.println("How many times do you want to roll? ");
        Scanner roll = new Scanner(System.in);
        int r = roll.nextInt();
        int t = 0;
        for (int i = 0; i < r; i++) {
            int face1 = (int)(Math.random()*6)+1;
            if (face1 == 6 || face1 == 1) {
                System.out.println("You've got a " + face1 + "!");
                t++;
            }
        }
        System.out.println("You've got either a 6 or a 1 for a total of " + t + " times.");
    }
}