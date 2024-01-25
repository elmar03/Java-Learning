package MentorLesson33;

import java.util.ArrayList;
import java.util.List;

public class User {
    int userId;
    String name;
    List<Task> tasksAssigned;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.tasksAssigned = new ArrayList<>();

    }

    public void assignTask(Task task){
        tasksAssigned.add(task);
    }

    public void displayAssignedTasks(){
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Assigned Tasks:");
        for (Task task : tasksAssigned) {
            System.out.println("- " + task.getDescription());
        }
    }


}
