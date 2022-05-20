public class Q6 {
    public static void main(String[] args) {
        int face1 = (int) (Math.random()*6)+1;
        int face2 = (int) (Math.random()*6)+1;
        System.out.println("Dice 1 = " + face1);
        System.out.println("Dice 2 = " + face2);
        if (face1 == face2) {
            System.out.println("Congratulations, you've rolled a DOUBLE!");
        } else{
            System.out.println("Good luck next time :< ");
        }
    }
}