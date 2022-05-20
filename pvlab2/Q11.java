/** File/Week2/Lab2Sol/Q5Max3.java Author @PV Pho Vu
 Draw a line with (-). If n=4, display ----
 */
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner number = new Scanner(System.in);
        int fact = 1;
        int factnum = number.nextInt();
        for(int i = 2; i <= factnum; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of " + factnum + " is " + fact + ".");
    }
}
