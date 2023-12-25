package Repetition.NestedExceptions;

import Repetition.NestedExceptions.NestedCustomException;

public class NestedException {
    public static void main(String[] args) {

        try {
            int result = divideByZero();
            System.out.println("Result: "+result);
        } catch (NestedCustomException z){
            System.out.println("Outer exception" + z.getMessage());
            Throwable cause = z.getCause();
            if(cause !=null){
                System.out.println("İnner exception " + cause.getMessage());
            }
        }


    }

    public static int divideByZero(){

        try {
            int a = 10;
            int b = 0;
            return a/b;
        }catch (ArithmeticException ae){

            throw new NestedCustomException("Cannot divide by zero",ae);
        }
    }
}
