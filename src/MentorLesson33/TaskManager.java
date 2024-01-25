package MentorLesson33;

import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> data;

    public TaskManager() {
        this.data = new ArrayList<>();
    }

    public void addTask(int taskId,String description,TaskStatus status) throws DuplicateTaskException{
        for (Task item:data ) {
            if (item.getTaskId() == taskId) {
                throw new DuplicateTaskException("This task with provided Id already exists!!, try new ID");
            }
    }
            Task task = new Task(taskId, description, status);
            data.add(task);

        }
        public void removeTask(int id) throws TaskNotFoundException {
            for (Task task : data) {
                if (task.getTaskId() == id) {
                    data.remove(task);
                } else {
                    throw new TaskNotFoundException("Task could not be find!! ,please try new ID");
                }
            }

        }

        public void displayTask () {
            for (Task task : data) {
                System.out.printf(String.valueOf(task));
            }
        }
    }

