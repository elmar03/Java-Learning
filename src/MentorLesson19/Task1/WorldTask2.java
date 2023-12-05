package MentorLesson19.Task1;

public class WorldTask2 implements Runnable{
    private SharedResource sharedResource;


    public WorldTask2(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) { // Repeat 5 times for demonstration
                sharedResource.printWorld();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

