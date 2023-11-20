package MentorLesson15;

public class Circle implements Resizable {

    @Override
    public void CalculateArea() {

    }

    public void area(double radius){
        System.out.println("Original size: " + Math.pow(radius,2)*Math.PI);
        System.out.println("İncreased size: "+Math.pow(radius,2)*Math.PI);
    }


}
