/** File/Week1/Lab1/Hello/PVOperations.java  @PV Pho Vu
 * Arithmetics. Basic Math Operations:  +,-,*, %,
 * Math.random(),Math.sqrt(n), Math.pow(n,e), System.out.println();
 * #4 in Lab
 */

public class PVOperations { // start class
    public static void main(String[] args) { // start main
        //exercise 4
        int p, b; // declare variables
        p = 20; // set p = 20
        b = 23; // set b = 23
        System.out.println("p + b = " + (p + b)); // display addition
        System.out.println("p - b = " + (p - b)); // display subtraction
        System.out.println("p * b = " + (p * b)); // display multiplication
        System.out.println("p / b = " + (p / b)); // display division
        System.out.println("p % b = " + (p % b)); // display modulus for remainder

        int result = p + p * b - b; // declare integer variable for an operation

        System.out.println("p + p * b - b = " + result); // display result
        System.out.println("Power of 2 = " + Math.pow(2,3)); // use Math.pow()
        System.out.println("Square root of 25 = " + Math.sqrt(25)); // use Math.sqrt()
        System.out.println("Absolute value of -2 = " + Math.abs(-2)); // use Math.Lab()


        //truth table - exercise 3
        System.out.println(true && true); // display case 1
        System.out.println(true && false); // display case 2
        System.out.println(true || false); // display case 3
        System.out.println(true && !(false)); // display case 4
        System.out.println(!true); // display case 5
        System.out.println(!false); // display case 6

    } // end main
} // end class

