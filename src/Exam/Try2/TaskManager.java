package Exam.Try2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    List <Task> tasks = new ArrayList<>();


    public  void addTask(String name,PriorityLevel level) throws CustomException{
        Task task = new Task(name,level);
        try {
            for(Task existingTasklis:tasks){
                if(existingTasklis.getName().equals(name)){
                    throw new CustomException("Already exists");
                }
            }
            System.out.println("Successfully added to the list");
            tasks.add(task);
        }catch (CustomException ce){
            System.out.println("Taskname already exists,please rename");
        }
    }

    public void removeTask(String name){
        for (Task existingTaskList: tasks) {
            if(existingTaskList.getName().equals(name)){
                tasks.remove(name);
                System.out.println("MentorLesson27.Task deleted");
            }else {
                System.out.println("Please enter valid input");
            }
        }
    }
    public void displayTask(){
        for (Task item:tasks) {
            System.out.println(item);
        }
    }

}
