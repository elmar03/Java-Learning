package Repetition.General;

public class NumFormatException {
    public static void main(String[] args) {

        validateFormat("gfgf");
    }

    public static void validateFormat(String input){

        try {
            int myInt = Integer.parseInt(input);
        }catch (NumberFormatException n){
            System.out.println("Please enter the valid value");
        }
    }
}
