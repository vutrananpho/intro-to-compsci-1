/**File: Week5/Lab5Sol/PVDectoBin @PV Pho Vu
 Same as above: ask user for a positive integer and
 display it in binary format.
 Then ask Continue(y/n)?
 */

        import java.util.Scanner; // import Scanner libary
public class PVDectoBin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.print("Enter a positive integer: ");
            int input = scanner.nextInt();
            System.out.println(Integer.toBinaryString(input));
            System.out.print("Continue(y/n)? ");
            answer = scanner.next();
        } while (answer.equals("y"));
        System.out.println("Bye!");
    }
}
