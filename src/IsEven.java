import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean x = (n % 2 == 0);

        if (x) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
