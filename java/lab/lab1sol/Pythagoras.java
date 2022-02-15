/** File/Week1/Lab1/Hello/Pythagoras.java Author @PV Pho Vu
Find the hypotenuse a,  use a = Math.sqrt(b*b + c*c)
 */

public class Pythagoras {
    public static void main(String[] args) {
        double b = 4, c = 3, a;
        a = Math.sqrt(b * b + c * c);
        System.out.println("The length of the hypotenuse is: " + a);
    }
}
