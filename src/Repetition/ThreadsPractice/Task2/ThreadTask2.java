package Repetition.ThreadsPractice.Task2;

public class ThreadTask2 implements Runnable{
    public String message;
    public ThreadTask2(String message) {
        this.message = message;
    }

    @Override
     public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+message);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}
