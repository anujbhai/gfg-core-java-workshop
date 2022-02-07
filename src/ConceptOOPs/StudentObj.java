package ConceptOOPs;

import java.util.Scanner;

public class StudentObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st1 = new Student();

        st1.name = "Rahul";
        st1.rollNumber = 10;

        Student st2 = new Student();

        st2.name = "Dr. Jekyll";
        st2.rollNumber = 100;

        System.out.println(st1.name + " " + st1.rollNumber);
        System.out.println(st2.name + " " + st2.rollNumber);
    }
}
