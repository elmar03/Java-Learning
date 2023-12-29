package Exam.Try1;

import Exam.Try1.PriorityLevel;

public class Task {
    String name;

    PriorityLevel priorityLevel;

    public Task(String name, PriorityLevel priorityLevel) {
        this.name = name;
        this.priorityLevel = priorityLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "Task " + name + ", priorityLevel=" + priorityLevel;
    }
}
