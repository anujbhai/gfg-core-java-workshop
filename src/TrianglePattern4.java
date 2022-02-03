import java.util.Scanner;

public class TrianglePattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (k <= 9) {
                    System.out.print("0" + k + " ");
                } else {
                    System.out.print(k + " ");
                }

                k++;
            }

            System.out.println();
        }
    }
}
