package MentorLesson31;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {

    HashMap<Integer,Student> data;

    public StudentDatabase() {
        this.data = new HashMap<>();
    }

    public void addStudent(int studentID,String name,int age) throws DuplicateValueException
    {
            if (data.containsKey(studentID)) {
                throw new DuplicateValueException("Student with the id " + studentID + " already exists");

            } else {
                Student student = new Student(studentID,name,age);
                data.put(studentID,student);
            }

    }

    public void  getStudentName(int id) throws NotFoundException {
        {
                if (!data.containsKey(id)) {
                    throw new NotFoundException("Student with the id " + id + " not found");
                } else {
                    System.out.println(data.get(id).getName());
                }

            }

    }
    public void  getAge(int id) throws NotFoundException {
        {
                if (!data.containsKey(id)) {
                    throw new NotFoundException("Student with the age " + id + " not found");
                } else {
                    System.out.println(data.get(id).getAge());
                }

            }

    }


}
