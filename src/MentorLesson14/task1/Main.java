package MentorLesson14.task1;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Batman",1500.0,5);
        Developer developer = new Developer("Hulk",1000.0,"Assembly");

        developer.getDetails();
        manager.getDetails();
    }

}
