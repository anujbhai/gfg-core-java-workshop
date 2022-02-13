package ConceptOOPs;

public class Student {
    String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void getRollNumber() {
        System.out.println(rollNumber);
    }
}
