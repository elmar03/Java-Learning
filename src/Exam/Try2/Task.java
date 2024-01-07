package Exam.Try2;

public class Task {
    String name;

    PriorityLevel level;

    public Task(String name, PriorityLevel level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriorityLevel getLevel() {
        return level;
    }

    public void setLevel(PriorityLevel level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MentorLesson27.Task{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
