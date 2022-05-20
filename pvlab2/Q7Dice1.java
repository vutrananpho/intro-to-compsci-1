import java.util.Scanner;
import java.util.Random;

public class Q7Dice1 {

    public static void main(String[] args) {
        Scanner dice = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many times do you want to roll the dice? ");
        int d = dice.nextInt();
        for (int i = 0; i < d; i++) {
            int number = (int)(Math.random()*6)+1;
            System.out.print(number + " ");
        }
    }
}
