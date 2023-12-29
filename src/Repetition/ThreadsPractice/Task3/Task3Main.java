package Repetition.ThreadsPractice.Task3;

public class Task3Main {
    public static void main(String[] args) {

        ThreadTask3 myThread1 = new ThreadTask3("How are you doing?");
        ThreadTask3 myThread2 = new ThreadTask3("I am good, thanks");

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);
        thread1.start();
        thread2.start();
    }
}
