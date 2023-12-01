package MentorLesson19.Task1;

public class WorldTask implements Runnable{
    static Object lock = new Object();


    @Override
    public void run() {
        synchronized (lock){
        for (int i = 0; i < 3; i++) {
            System.out.println("World");

            lock.notify();
        }}}
}
