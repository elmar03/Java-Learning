package Lesson22.Task2;

import java.util.Comparator;

public class Student  {
    String name;
    int age;
    Integer grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: " +
                " name- " + name + '\'' +
                ", age- " + age +
                ", grade- " + grade ;
    }

//    @Override
//    public int compare(Student o1, Student o2) {
//        return 0;
//    }
}
