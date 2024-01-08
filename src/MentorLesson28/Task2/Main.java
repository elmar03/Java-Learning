package MentorLesson28.Task2;

public class Main {
    public static void main(String[] args) {

        GradeTracker gradeTracker = new GradeTracker();

        gradeTracker.addStudent("A");
        gradeTracker.addStudent("B");
        gradeTracker.addStudent("C");

        gradeTracker.addGrade("B",65);
        gradeTracker.addGrade("C",78);
        gradeTracker.addGrade("A",83);

    }
}
