package MentorLesson19.Task1;

public class WorldTask implements Runnable{
    static Object lock = new Object();


    @Override
<<<<<<< HEAD
    public void run() {
        synchronized (lock){
        for (int i = 0; i < 3; i++) {
            System.out.println("World");

            lock.notify();
        }}}
}
=======
    public synchronized void run() {

        for (int i = 0; i < 3; i++) {
            System.out.println("World");

        }}}

>>>>>>> 9e14541 (Initial commit2)
