/** File/Week2/Lab2Sol/Q11.java Author @PV Pho Vu
 Factorial for n (n!)
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