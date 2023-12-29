package Exam.Try2;

import Exam.Try3.TaskManager2;

public class Main {
    public static void main(String[] args)  {


        TaskManager taskManager = new TaskManager();

        TaskManager2 taskManager2 = new TaskManager2();
        taskManager2.addTask2();
        System.out.println(taskManager2);
    }
}
