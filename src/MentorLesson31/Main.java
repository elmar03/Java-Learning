package MentorLesson31;

public class Main {
    public static void main(String[] args)  {
        StudentDatabase studentDatabase = new StudentDatabase();
        try {
            studentDatabase.addStudent(1, "John Doe", 20);
            studentDatabase.addStudent(2, "Jane Smith", 22);

            studentDatabase.getStudentName(1);
            studentDatabase.getAge(2);

            // duplicate student
            studentDatabase.addStudent(1, "Duplicate John", 25);
//
            // trying to retrieve information for non-existent student
            studentDatabase.getStudentName(5);
        } catch (DuplicateValueException | NotFoundException e) {
            System.err.println(e.getMessage());
        }




    }
}
