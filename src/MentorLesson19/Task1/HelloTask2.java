package MentorLesson19.Task1;

public class HelloTask2 implements Runnable{
    private SharedResource sharedResource;

    public HelloTask2(SharedResource sharedResource) {
        this.sharedResource = sharedResource;

    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                sharedResource.printHello();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

