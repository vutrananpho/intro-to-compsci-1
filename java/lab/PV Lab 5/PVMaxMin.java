/** File: Week5/Lab5Sol/Q4PVMaxMin.java @PV Pho Vu
 Write a program that asks the user to input numbers until you type
 0 and then print their sum and product and minimum.
 */
import java.util.Scanner; // import Scanner library
public class PVMaxMin {
    public static void main(String[] args) {
        System.out.println("Enter numbers ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int prod = 1;
        int min = 0;

        while (num != 0) {
            sum += num;
            prod *= num;
            min = Math.min(min, num);
            num = scanner.nextInt();
        }
        System.out.println("Sum equals " +  num);
        System.out.println("Min equals " + min);
    }
}
