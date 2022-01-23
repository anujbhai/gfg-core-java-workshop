import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            // System.out.println(i + " Java game dev, mobile dev, full-stack-web-app dev.");
            sum = sum + i;

            // for (int j = 1; j <= n; j++) {
            // System.out.println(i + " " + j);
            // }
        }

        System.out.println("Sum: " + sum);
    }
}
