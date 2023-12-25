package Repetition.General;

import java.util.ArrayList;
import java.util.List;

public class ConcurrencyException {

    public static List<String > sharedList = new ArrayList<>();
    public static void main(String[] args) {

        Thread thread1 = new Thread(()->modifyList("Thread 1"));
        Thread thread2 = new Thread(()->modifyList("Thread 2"));

        thread1.start();
        thread2.start();

    }

    public static  void modifyList (String threadName){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (sharedList){
                sharedList.add(threadName+" - Element "+i);

                System.out.println(threadName+" - Modified List: "+sharedList);
            }
        }

    }
}
