import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String instruction;
        boolean raining;
        boolean humid;
        int precipitation;

        precipitation = s.nextInt();
        raining = (precipitation >= 100);
        humid = (precipitation <= 50);

        if (raining) {
            instruction = "Get inside.";
        } else if (humid) {
            instruction = "Do not get dehydrated.";
        } else {
            instruction = "Go outside and play.";
        }

        System.out.println(instruction);
    }
}
