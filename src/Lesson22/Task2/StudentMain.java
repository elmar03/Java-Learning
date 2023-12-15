package Lesson22.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        List <Student> studentList = new ArrayList<>();
        studentList.add(new Student("A",19,75));
        studentList.add(new Student("M",21,77));
        studentList.add(new Student("L",23,81));
        studentList.add(new Student("D",22,71));
        studentList.add(new Student("K",20,70));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.grade.compareTo(o1.grade);
            }
        });

        //Collections.sort(studentList,Collections.reverseOrder(Comparator.comparingInt(Student-> Student.grade)));

        for (Student values: studentList
             ) {
            System.out.println(values);
        }

    }
}
