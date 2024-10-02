import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int d = 1; d <= n; ++d) {
            int k;
            for(k = d; k < n; ++k) {
                System.out.print(" ");
            }

            for(k = 1; k <= 2 * d - 1; ++k) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}
