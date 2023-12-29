package MentorLesson27;

public class Main {
    public static void main(String[] args) {

        UserNameManager userNameManager = new UserNameManager();

        userNameManager.addUserName("Elmar");
        userNameManager.addUserName("Togrul");
        userNameManager.addUserName("Huseyn");
        userNameManager.addUserName("Nubar");


        userNameManager.removeUserName("Elmar");
        userNameManager.displayUserName();

        userNameManager.containsUserName();
    }
}
