/** File/Week1/Lab1/Hello/Operations.java Author @PV Pho Vu
 Arithmetics. Basic Math Operations:  +,-,*, %,
 Math.random(),Math.sqrt(n), Math.pow(n,e), System.out.println();
 */

public class Operations {
    public static void main(String[] args) {
        //exercise 4
        int p, b;
        p = 20;
        b = 23;
        System.out.println("p + b = " + (p + b)); // addition
        System.out.println("p - b = " + (p - b)); // subtraction
        System.out.println("p * b = " + (p * b)); // multiplication
        System.out.println("p / b = " + (p / b)); // division
        System.out.println("p % b = " + (p % b)); // modulus for remainder
        int result = p + p * b - b;
        System.out.println("p + p * b - b = " + result);

        //truth table - exercise 3
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true && !(false));
        System.out.println(!true);
        System.out.println(!false);

    } //main
} //class

