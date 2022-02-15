/** File/Week1/Lab1/Hello/Bytes2bits.java Author @PV Pho Vu
 */
import java.util.Scanner;

public class Bytes2bits {
    public static void main(String[] args) {
        Scanner bytes = new Scanner(System.in);
        System.out.print("Enter bytes: ");
        int b = bytes.nextInt();
        System.out.println("Convert to bytes: " + b*8);
    }
}
