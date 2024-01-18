package Exam.Try2;

import Exam.Try3.TaskManager2;

public class Main {
    public static void main(String[] args) throws CustomException {


        TaskManager taskManager = new TaskManager();

        taskManager.addTask("A",PriorityLevel.LOW);

        TaskManager2 taskManager2 = new TaskManager2();
        taskManager2.addTask2();
        taskManager.displayTask();

    }
}
