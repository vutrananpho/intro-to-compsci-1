/** File/Week1/Lab1/Hello/OperationsDouble.java Author @PV Pho Vu
 Display square root of an integer between 0 and 1000
 0 < c < 1000
 */

public class Sqrt {
    public static void main(String[] args) {
        int c = (int) Math.random() * 1000;
        System.out.println("Random integer generated: " + c);
        System.out.println("Square root of c equals: " + Math.sqrt(c));
    }
}