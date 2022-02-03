import java.util.Scanner;

public class inputHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int i = s.nextInt();
//        float f = s.nextFloat();
//
//        System.out.println("Value of i: " + i);
//        System.out.println("Value of f: " + f);

        String str = s.nextLine();
        char ch = str.charAt(0);

        System.out.println("str: " + ch);

    }
}
