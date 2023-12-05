package MentorLesson19.Task1;

public class SharedResource {
    private boolean isHelloTurn = true;

    public synchronized void printHello() throws InterruptedException{
        while(!isHelloTurn){
            wait();
        }
        System.out.println("Hello");
        isHelloTurn = false;
        notify();
    }
    public synchronized void printWorld() throws InterruptedException {
        while (isHelloTurn) {
            wait();
        }
        System.out.println("World");
        isHelloTurn = true;
        notify();
    }
}
