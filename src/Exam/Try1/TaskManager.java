package Exam.Try1;

import Exam.Try1.PriorityLevel;
import Exam.Try1.Task;

import java.util.ArrayList;

public class TaskManager {

    public ArrayList <Task> tasks;

    public TaskManager(ArrayList<Task> tasks) {
        tasks = new ArrayList<>();
    }

//    public void  add (MentorLesson27.Task taskName, PriorityLevel priorityLevel){
//        MentorLesson27.Task task = new MentorLesson27.Task(taskName,  priorityLevel);
//        tasks.add(task);
//    }

    public void remove(String taskName){
        tasks.removeIf(task -> task.toString().equals(taskName));
    }

    public void display(){
        System.out.println("Tasks List:");
        for (Task item: tasks
             ) {
            System.out.println(item);
        }
    }

    public void byPriorityLevel(PriorityLevel priorityLevel){
        System.out.println(" Tasks" + priorityLevel );

        for (Task item: tasks
             ) {
            if(priorityLevel.equals(item.getPriorityLevel())){
                System.out.println(item);
            }
        }

    }

}
