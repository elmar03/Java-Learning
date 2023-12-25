package Repetition.NestedExceptions;

import Repetition.ArithmethicException.InvalidInputException;

public class NumberValidator {
    public static void main(String[] args) throws NumberValidatorException {


        try {
            validateNumber("salam");
        } catch (NumberFormatException iie){

            Throwable cause = iie.getCause();
            throw new NumberValidatorException("Error happened",cause);
        }

    }

    public static void validateNumber(String number) throws NumberValidatorException {

        try {
            int myInt = Integer.parseInt(number);
        }catch (NumberFormatException ae){
            throw new NumberValidatorException("Error happened "+number,ae);
        }

    }
}
