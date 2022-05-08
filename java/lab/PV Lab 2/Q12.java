/** File/Week2/Lab2Sol/Q5Max3.java Author @PV Pho Vu
 Draw a line with (-). If n=4, display ----
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
