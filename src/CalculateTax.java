import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N;
        double tax;

        for (int i = 1; i <= T; i++) {
            N = sc.nextInt();

            if (N <= 1000) {
                tax = 0;
                System.out.println((int) tax);
            } else if (N > 1000 && N <= 100000) {
                tax = 0.1 * N;
                System.out.println((int) tax);
            } else if (N > 100000 && N <= 1000000) {
                tax = 0.2 * N;
                System.out.println((int) tax);
            } else if (N > 1000000) {
                tax = 0.25 * N;
                System.out.println((int) tax);
            }
        }
    }
}
