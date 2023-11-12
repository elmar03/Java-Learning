package MentorLesson11;

public class Counter {
    int count;
    static int totalCount=0;


    public  Counter(){
        totalCount++;
    }

    public int getCount() {
        return count;
    }

}
