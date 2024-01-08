package MentorLesson28.Task2;

import java.util.HashMap;
import java.util.Map;

public class GradeTracker {

    Map<String,Integer> studentGrades;

    public GradeTracker(){
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(String studentName){
        studentGrades.put(studentName,0);
    }

    public void addGrade(String studentName, int grade){
        if(studentGrades.containsKey(studentName)){
            studentGrades.put(studentName,grade);
        }
    }


}
