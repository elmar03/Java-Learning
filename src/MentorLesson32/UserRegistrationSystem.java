package MentorLesson32;

import MentorLesson31.DuplicateValueException;

import java.util.HashSet;
import java.util.Scanner;

public class UserRegistrationSystem {
    Scanner scanner = new Scanner(System.in);

    HashSet<User> registeredUser;

    public UserRegistrationSystem() {
        this.registeredUser = new HashSet<>();
    }

    public void addUser() throws DuplicateValueException, DuplicateUserNameException {
        while (true) {
            System.out.println("Please enter the username: ");
            String userName = scanner.nextLine();
            System.out.println("Please enter the email: ");
            String email = scanner.nextLine();

            if (userName.equalsIgnoreCase("Exit") || email.equalsIgnoreCase("Exit")) {
                System.out.println("Exited program");
                break;
            } else if (registeredUser.stream().anyMatch(user -> user.getUserName().equalsIgnoreCase(userName))) {
                throw new DuplicateUserNameException("This username already exists, please try new one");
            } else {
                User user = new User(userName, email);
                registeredUser.add(user);
            }
        }

    }


    public void displayUsers() {
        if (registeredUser.isEmpty()) {
            System.out.println("There are not any users");
        } else {
            for (User item : registeredUser
            ) {
                System.out.println(item);
            }
        }
    }
}
