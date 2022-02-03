import java.util.Scanner;

public class FactorialFunction {
    public static int factorial(int n) {
        int ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }

        return ans;
    }

    public static double finalFactorial(int n, int r) {
        int ans = factorial(n);
        int ans1 = factorial(n - r);
        int ans2 = factorial(r);

        return (double) ans / (ans1 * ans2);
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int r = sc1.nextInt();

        System.out.println(finalFactorial(n, r));
    }
}
