package Repetition.Custom;

import Repetition.ArithmethicException.InvalidInputException;

public class CustomException {
    public static void main(String[] args) throws InvalidInputException {

       try {
           validateAge(-5);
       } catch (InvalidInputException e){
           System.out.println("Caught in main: "+e.getMessage());
       }

    }
    public static void validateAge(int age) throws InvalidInputException{

            if(age<0){
                throw new InvalidInputException("Age cannot be less than zero");


    }
}}
