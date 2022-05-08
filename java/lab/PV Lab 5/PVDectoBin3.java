/** File: Week 5/Lab5Sol/PVDectoBin3 @PV Pho Vu
 Write all the integers from 1 to 100 in binary. HINT:  Lab5Sol/DectoBin.java
 for (int i = 0; ...; i++){
 System.out.println(i + .. + Integer.toBinaryString(i));}
 */
public class PVDectoBin3 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++) {
            System.out.println(i + ": " + Integer.toBinaryString(i));
        }
    }
}
