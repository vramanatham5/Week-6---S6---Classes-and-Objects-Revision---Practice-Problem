class Student {
    String name;
    double attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println("College: " + collegeName);
        System.out.println("Student count: " + studentCount);
    }
}

public class in {
    public static void main(String[] args) {
        new Student("Aarav", 92.5);
        new Student("Diya", 88.0);
        Student.printCollegeInfo();
    }
}