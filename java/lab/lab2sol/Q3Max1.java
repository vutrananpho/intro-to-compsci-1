/** File/Week2/Lab2Sol/Q3Max1.java Author @PV Pho Vu
 Find maximum in two values given.
 */
import java.util.Scanner;

public class Q3Max1 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers: ");
        Scanner number = new Scanner(System.in);
        int n1 = number.nextInt();
        int n2 = number.nextInt();
        System.out.println("The maximum of two numbers: " + Math.max(n1,n2));
    }
}
