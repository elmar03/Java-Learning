package MentorLesson21.Task1;

import java.util.Scanner;

public class InputValidator {

    String userInput;
    Scanner scanner = new Scanner(System.in);

    public InputValidator(String userInput) {
        this.userInput = userInput;
    }

    public boolean validateNumberInput(String userInput) {
        boolean isDigit = false;
        char[] array = userInput.toCharArray();
        char[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < userInput.length(); i++) {
            for (int j = 0; j < digits.length; j++) {
                if (array[i] == digits[j]) {
                    isDigit= true;
                    break;
                }
            }
            if(!isDigit){
                return false;
            }
        }
        return true;
    }

    public static boolean validateTextInput(String userInput) {
        String text=userInput.toLowerCase();
        char[] array = text.toCharArray();
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'c', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x','y','z'};

        for (int i = 0; i < userInput.length(); i++) {
            for (int j = 0; j < letters.length; j++) {
                if (array[i] == letters[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean validateSpecialInput(String userInput) {

        char[] array = userInput.toCharArray();
        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};

        for (int i = 0; i < userInput.length(); i++) {
            for (int j = 0; j < specialCharacters.length; j++) {
                if (array[i] == specialCharacters[j]) {
                    return true;
                }
            }
        }
        return false;
    }


}
