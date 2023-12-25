package Repetition.Custom;

import Repetition.Custom.AgeLessThanZeroException;

public class CustomExceptions {

    public static void main(String[] args) throws AgeLessThanZeroException {

        validateAge(-10);
    }

    public static void validateAge (int age) throws AgeLessThanZeroException{

        if (age <0){
            throw new AgeLessThanZeroException("Age cannot be negative!!!");
        }
    }
}
