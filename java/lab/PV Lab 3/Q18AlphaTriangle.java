public class Q18AlphaTriangle {
    public static void main(String[] args) {
        int i, j, n = 26;
        for (i = 1; i <= n; i++)
        {
            int ch = 65;
                for (j = i; j <= n; j++)
                {
                    System.out.print((char)(ch -1 + j) + " ");
                }
                System.out.print("\n");
        }
    }
}
