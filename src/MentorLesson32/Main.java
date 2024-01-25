package MentorLesson32;

import MentorLesson31.DuplicateValueException;

public class Main {
    public static void main(String[] args) throws DuplicateUserNameException, DuplicateValueException {



        UserRegistrationSystem userRegistrationSystem = new UserRegistrationSystem();
        userRegistrationSystem.addUser();
        userRegistrationSystem.displayUsers();

    }
}
