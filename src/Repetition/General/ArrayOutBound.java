package Repetition.General;

public class ArrayOutBound {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8};

        try {
            System.out.println(numbers[15]);
        } catch (ArrayIndexOutOfBoundsException AIOBE){
            System.out.println("The index you are reaching, does not exist in the list");
        }

    }
}
