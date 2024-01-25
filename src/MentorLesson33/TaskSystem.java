package MentorLesson33;

public class TaskSystem {
    public static void main(String[] args) throws TaskNotFoundException, DuplicateTaskException {

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(100,"A",TaskStatus.IN_PROGRESS);
        taskManager.addTask(101,"B",TaskStatus.TODO);
        taskManager.addTask(102,"C",TaskStatus.DONE);
        taskManager.addTask(103,"D",TaskStatus.TODO);
        taskManager.addTask(104,"E",TaskStatus.IN_PROGRESS);

        //taskManager.addTask(102,"H",TaskStatus.IN_PROGRESS);

        User user = new User(1,"Əli");


        user.assignTask(new Task(100,"A",TaskStatus.IN_PROGRESS));
        user.assignTask(new Task(102,"B",TaskStatus.DONE));

        user.displayAssignedTasks();



    }
}
