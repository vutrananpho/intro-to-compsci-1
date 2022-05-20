/** File/Week2/Lab2Sol/Q2Inputcond0.java Author @PV Pho Vu
 Say "Thanks" or "Good bye" for an integer between 10 and 20
 */
import java.util.Scanner;

public class Q2Inputcond0 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);//declare place where to read
        System.out.print("Enter an integer: ");
        int n = cin.nextInt();  //initialize and read from console
        if (n > 10 && n < 20 && n % 2 == 0) {
            System.out.print("Thanks");
        }
        else {
            System.out.print("Goodbye");
        }
        }
    }
