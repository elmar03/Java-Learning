package Repetition.ThreadsPractice.Task4;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter a = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    a.increment();
                    System.out.println(Thread.currentThread().getName()+a);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    a.increment();
                    System.out.println(Thread.currentThread().getName()+a);
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        //System.out.println("Count " +a.count );
    }
}
