/** File/Week2/Lab2Sol/Q12.java Author @PV Pho Vu
 Add all integers from 1 to n
 */
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        System.out.println("Give an integer: ");
        Scanner num = new Scanner(System.in);
        int sum = 0;
        int num1 = num.nextInt();
        for(int i = 1; i <= num1; i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum of all intergers from 1 to " + num1 + " equals " + sum + ".");
    }
}