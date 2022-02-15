/** File/Week1/Lab1/Hello/QuadFormula.java Author @PV Pho Vu
Solve the quadratic equation
 */
public class QuadFormula {
    public static void main(String[] args) {
        //value a, b, and c
        double a = 1, b = 1, c = 1;
        double root1, root2;

        //calculate the determinant (b^2-4ac)
        double determinant = b*b - 4*a*c;

        //check if determinant is greater than 0;
        if (determinant > 0) {

        }
        // real and imaginary roots
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        System.out.println(root1);
        System.out.println(root2);

    }
}

