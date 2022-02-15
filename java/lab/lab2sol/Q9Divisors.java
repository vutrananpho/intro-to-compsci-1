/** File/Week2/Lab2Sol/Q9Divisors.java Author @PV Pho Vu
 Display all the factors of a given integer n
 */
import java.util.Scanner;

public class Q9Divisors {
    public static void main(String[] args) {
        System.out.println("Think of an integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Display all the factors of " +n+ ":");
        for (int i = 1; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
