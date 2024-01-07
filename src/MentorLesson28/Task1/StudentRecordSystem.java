package MentorLesson28.Task1;

import MentorLesson28.Task1.Student;

import java.util.ArrayList;

public class StudentRecordSystem {
        ArrayList<Student> data = new ArrayList<>();

    public void addStudent(Student student){
        data.add(student);
    }

    public void removeStudent(int id){
        data.removeIf(student -> student.getId()== student.id);
        System.out.println("Student  with the id of "+id+ " is deleted from database");
    }

    public void displayStudents(){
        for (Student item:data) {
            System.out.println(item);
        }
    }



}
