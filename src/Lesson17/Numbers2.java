package Lesson17;

public class Numbers2 {
    private static Object lock= new Object();
    private static  int count = 1;
    private static int MAX_COUNT = 10000;

    public static void main(String[] args) {
        for (int i = 0; i <MAX_COUNT ; i++) {

            Thread thread0 = new Thread(() -> {
                synchronized (lock) {
                    while (count % 2 == 0 && count <= MAX_COUNT) {
                        System.out.println(Thread.currentThread().getName() + " Even Number: " + count);
                        count++;
                    }
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                    }
                }
            });
            Thread thread1 = new Thread(() -> {
                synchronized (lock) {
                    while (count % 2 != 0 && count <= MAX_COUNT) {
                        System.out.println(Thread.currentThread().getName() + " Odd Number: " + count);
                        count++;
                    }
                    lock.notify();
                }
            });

            thread0.start();
            thread1.start();
        }
}}
