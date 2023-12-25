package Repetition.Custom;

public class ExceptionHandling {
    public static void main(String[] args) {


        try {
            int myInt = Integer.parseInt("Salam");
        } catch (NumberFormatException e){
            System.out.println("This value cannot be converted to integer");
        }
    }
}
