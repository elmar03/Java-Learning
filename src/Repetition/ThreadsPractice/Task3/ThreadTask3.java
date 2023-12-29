package Repetition.ThreadsPractice.Task3;

public class ThreadTask3 implements Runnable{

    public String message;

    public ThreadTask3(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+": "+message);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
