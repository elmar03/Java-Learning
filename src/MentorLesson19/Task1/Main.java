package MentorLesson19.Task1;

public class Main {
    public static void main(String[] args) {
        HelloTask helloTask = new HelloTask();
        WorldTask worldTask = new WorldTask();
        Thread helloThread = new Thread(helloTask);
        Thread worldThread = new Thread(worldTask);
        helloThread.start();
        worldThread.start();
    }
}
