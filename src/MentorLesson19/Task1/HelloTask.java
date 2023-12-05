package MentorLesson19.Task1;

public class HelloTask implements Runnable{
    static Object lock = new Object();

    public HelloTask(SharedResource sharedResource) {

    }


    @Override
    public void run() {
<<<<<<< HEAD
        synchronized (lock){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
            try {
                    lock.wait();

            } catch (InterruptedException e) {
            }
         lock.notify();
        }

    }
}}
=======
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");

        }

    }
}
>>>>>>> 9e14541 (Initial commit2)
