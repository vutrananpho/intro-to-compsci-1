/** File/Week1/Lab1/Hello/Operatio.java Author @PV Pho Vu
 Arithmetics. Basic Math Operations:  +,-,*, %,
 Math.random(),Math.sqrt(n), Math.pow(n,e), System.out.println();
 */

public class Power2 {
    public static void main(String[] args) {
        int n = (int)Math.random() * 100; // assign value of 10 to variable n
        System.out.println("Generate random power: " + n);
        System.out.println("Two to the tenth power equals: " + Math.pow(2,n));
    }
}