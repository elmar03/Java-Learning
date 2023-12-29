package Exam.Try3;

import Exam.Try2.PriorityLevel;
import Exam.Try2.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager2 {
    Scanner scanner = new Scanner(System.in);

    List<Task> tasks = new ArrayList<>();

    public  void addTask2 (){
        System.out.println("Enter task name: ");
        String name = scanner.nextLine();
        System.out.println("Choose the priority level: LOW,HIGH, MEDIUM ");
        String input = scanner.nextLine();
        PriorityLevel level = PriorityLevel.valueOf(input.toUpperCase());

        Task task = new Task(name,level);


    }

}
