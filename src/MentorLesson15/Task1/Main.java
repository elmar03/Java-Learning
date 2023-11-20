package MentorLesson15.Task1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum 1: "+calculator.add(15,47));
        System.out.println("Sum 2: "+calculator.add(19.75,89.68));
        System.out.println("Sum 3: "+calculator.add(15,47,74));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("Result: "+scientificCalculator.power(4,4));

    }
}
