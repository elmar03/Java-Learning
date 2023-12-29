package Repetition.ThreadsPractice.Task2;

public class Task2Main {
    public static void main(String[] args) {
        ThreadTask2 myThread1 = new ThreadTask2("Hello");
        ThreadTask2 myThread2 = new ThreadTask2("World");

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);

        thread1.start();
        thread2.start();
    }
}
