package MentorLesson28.Task1;

public class Main {

    public static void main(String[] args) {
        StudentRecordSystem studentRecordSystem = new StudentRecordSystem();
        studentRecordSystem.addStudent(new Student(1,"A","History"));
        studentRecordSystem.addStudent(new Student(2,"B","Math"));
        studentRecordSystem.addStudent(new Student(3,"C","Computer Science"));

     studentRecordSystem.displayStudents();
//
//
        studentRecordSystem.removeStudent(3);
//
        studentRecordSystem.displayStudents();

        studentRecordSystem.searchByDepartment("History");






    }
}
