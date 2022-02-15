/** File/Week2/Lab2Sol/Q5Max3_2.java Author @PV Pho Vu
 Display max and min from 3 integers. 2nd Solution
 */
import java.util.Scanner;

public class Q5Max3_2 {
    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner num = new Scanner(System.in);
        int[]A = new int[10];
        for (int i = 1; i<=10; i++)
        { A[i-1]= num.nextInt();
        }
        int Max = A[0];
        int Min = A[0];
        for (int i = 1; i <=9; i++) {
            if (Max < A[i]) {
                Max = A[i];
            }
            if (Min > A[i]) {
                Min = A[i];
            }
        }
        System.out.println("Max equals " + Max);
        System.out.println("Min eqauls " + Min);
    }
}