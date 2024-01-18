package MentorLesson28.Task1;

import MentorLesson28.Task1.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentRecordSystem {
        ArrayList<Student> data = new ArrayList<>();

    public void addStudent(Student student){
        data.add(student);
    }

    public void removeStudent(int id){
        //data.removeIf(student -> student.getId()== student.id);
        Iterator<Student> iterator = data.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId()==id){
                iterator.remove();
            }
        }

//        for (Student student : data){
//            if(student.getId()==student.id){
//                data.remove();
//            }
//        }
        System.out.println("Student  with the id of "+id+ " is deleted from database");

    }

    public void displayStudents(){
        for (Student item:data) {
            System.out.println(item);
        }
    }

    public void searchByDepartment(String department){

        for (Student item: data) {
            if(item.getDepartment().equalsIgnoreCase(department)){
                System.out.println(item);
            }
        }

    }



}
