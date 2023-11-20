package MentorLesson15;

public class Rectangle implements Resizable {

    @Override
    public void CalculateArea() {
    }

    public void area (int width, int length){
        System.out.println("Original size: " + width*length*0.5);
        System.out.println("İncreased size: " + width*length*0.5*1.5);

    }

}
