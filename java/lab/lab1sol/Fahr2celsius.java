/** File/Week1/Lab1/Hello/Fahr2celsius.java Author @PV Pho Vu
 Solve the quadratic equation: ax^2 + bx + c = 0
 */
public class Fahr2celsius {
    public static void main(String[] args) {
        double fahrenheit = 70, celsius;
        celsius = ((fahrenheit - 32) * 5)/9;
        double fahrenheit2 = ((celsius*9/5)+32);
        System.out.println("70 Fahrenheit degree in Celsius is: " + celsius);
        System.out.println("Fahrenheit degree of: " + fahrenheit2);
    } //main
} //class
