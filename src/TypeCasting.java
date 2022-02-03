public class TypeCasting {
    public static void main(String[] args) {
//        char c = 'a';
        int i = 97;
        char c = (char) i;

        double d = 87.0;
        float f = (float) d;

        System.out.println("Value of c: " + c);
        System.out.println("Value of f: " + f);

        System.out.println(97.5 + 9);
        System.out.println(98.5 + 9.5);
        System.out.println(98 + 9);

    }
}
