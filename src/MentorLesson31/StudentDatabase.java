package MentorLesson31;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {

    HashMap<String,Student> data = new HashMap<>();

    public StudentDatabase() {
        this.data = new HashMap<>();
    }

    public void addStudent(String major,int sutdentID,String name,int age){
        Student student = new Student(sutdentID,name,age);
        data.put(major,student);
    }


}
