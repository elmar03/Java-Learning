package MentorLesson19.Task1;

public class Main2 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread helloThread = new Thread(new HelloTask2(sharedResource));
        Thread worldThread = new Thread(new WorldTask2(sharedResource));

        helloThread.start();
        worldThread.start();
    }
}
