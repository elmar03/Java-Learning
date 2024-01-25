package MentorLesson33;

public class Task {
    int taskId;
    String description;
    TaskStatus status;
    public Task(int taskId, String description, TaskStatus status) {
        this.taskId = taskId;
        this.description = description;
        this.status = status;

    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", status=" + status ;
    }
}
