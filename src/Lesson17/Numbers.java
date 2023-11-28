package Lesson17;

import javax.swing.plaf.TableHeaderUI;

public class Numbers extends Thread{
    private static final Object lock = new Object();
    private static  int count = 1;
    private static int MAX_COUNT = 10000;
    private final boolean isEvenThread;

    public Numbers(boolean isEvenThread) {
        this.isEvenThread = isEvenThread;
    }
    @Override
    public void run() {
        synchronized (lock){
            while(count<=MAX_COUNT){
                if((count%2==0 && isEvenThread)||(count%2 !=0 && !isEvenThread)){
                    System.out.println(Thread.currentThread().getName()+": "+(isEvenThread? "Even":"Odd")+" Number "+count);
                    count++;
                    lock.notify();
                }else{
                    try {
                        lock.wait();
                    }catch (InterruptedException e){

                    }
                }
            }
        }

    }
}
