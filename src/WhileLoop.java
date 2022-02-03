import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 0;

//        while (i <= n) {
//            System.out.println(i + " Java game dev, mobile dev, full-stack-web-app dev.");
//            i += 1;
//        }

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum: " + sum);
    }
}
