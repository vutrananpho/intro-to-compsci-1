/**File: Week5/Lab5Sol/PVDectoBin @PV Pho Vu
 Ask user for a positive integer and display it in binary format.
 Use: Integer.toBinaryString(n).
 */

import java.util.Scanner;
public class PVDectoBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int input = scanner.nextInt();
        System.out.println("Display it in binary format: " + Integer.toBinaryString(input));
    }
}
