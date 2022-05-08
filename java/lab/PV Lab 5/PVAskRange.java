/** File: Week5/Lab5Sol/Q3PVAskRange.java @PV Pho Vu
 Write a program that asks you to enter a number in certain range [n1,n2] and if you do not enter the right input it asks you again. Then build an ArrayList with many = 5 times with your chosen integer.
 Example. Enter n, 5 <= n <= 10 ?  2
 Enter n, 5 <= n <= 10 ?  2
 Enter n, 5 <= n <= 10 ?  6
 Result: [6,6,6,6,6]
 */
import java.util.Scanner;
public class PVAskRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 5;
        int n2 = 10;
        int enter = 0;
        System.out.print("Enter a number in a range from " + n1 + " to " + n2 +": ");
        boolean first = true;
        do {
            if (!first) {
            System.out.println("Wrong. Please enter a number in a range from " + n1 + " to " + n2 + "."); }
            first = false;
            enter = scanner.nextInt();
        } while (enter<5 || enter >10); // condition
        Integer[] A = {enter, enter, enter, enter, enter};
        System.out.print("[");
        for (int i = 0; i < 4; i++) {
            System.out.print(enter + ", ");
        } System.out.println(enter + "]");
        System.out.println("Bye!");
    }
}


