package Repetition.ThreadsPractice.Task4;

public class Counter {

    int count;

    public  synchronized void increment(){
        count++;
    }

    @Override
    public String toString() {
        synchronized (this){
        return " Counter: " + count;
    }}
}
