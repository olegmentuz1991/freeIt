package Task29;

public class Run {
    public static void main(String[] args) {
        Student student = new Student("Vasya");
        System.out.println(student.cleanAllBadGrade(student.gradeRandomizer()));
    }
}
