import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b;

        a = s.nextInt();
        b = s.nextInt();

        // Relational operators
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));

        // Logical operators
        System.out.println("a and b are greater that 0? " + ((a > 0) && (b > 0)));
        System.out.println("a and b are greater that 0? " + ((a > 100) || (b > 100)));
    }
}
