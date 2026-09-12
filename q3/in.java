class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    int totalCredits() {
        return credits + labCredits;
    }
}

public class in {
    public static void main(String[] args) {
        Course courseWithLab = new Course("CS101", "Object Oriented Programming", 3, 1);
        Course theoryOnlyCourse = new Course("MA101", "Engineering Mathematics", 4);

        System.out.println(courseWithLab.title + " total credits: " + courseWithLab.totalCredits());
        System.out.println(theoryOnlyCourse.title + " total credits: " + theoryOnlyCourse.totalCredits());
    }
}