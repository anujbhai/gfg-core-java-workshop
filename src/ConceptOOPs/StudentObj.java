package ConceptOOPs;

import java.util.Scanner;

public class StudentObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student("Rahul", 10);
        Student st2 = new Student("Dr. Jekyll", 100);

        System.out.println(st1.name);
        st1.getRollNumber();
        System.out.println(st2.name);
        st2.getRollNumber();
//        System.out.println(st1.name);
//        System.out.println(st2.name);
    }
}
