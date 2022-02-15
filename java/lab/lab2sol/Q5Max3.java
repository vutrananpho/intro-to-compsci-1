/** File/Week2/Lab2Sol/Q5Max3.java Author @PV Pho Vu
 Display max and min from 3 integers.
 */
import java.util.Scanner;

public class Q5Max3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();
        if (num1>num2 && num1>num3)
            System.out.println("Maximum of three integers: " + num1);
        else if (num2>num1 && num2>num3)
            System.out.println("Maximum of three integers: " + num2);
        else if (num3>num2 && num3>num1)
            System.out.println("Maximum of three integers: " + num3);
        if (num1<num2 && num1<num3)
            System.out.println("Minimum of three integers: " + num1);
        else if (num2<num3 && num2<num1)
            System.out.println("Minimum of three integers: " + num2);
        else if (num3<num1 && num3<num2)
            System.out.println("Minimum of three integers: " + num3);
    }
}