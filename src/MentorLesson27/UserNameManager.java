package MentorLesson27;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserNameManager {

    String userName;

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return
                "userName=" + userName;
    }

    List <String> data = new ArrayList<>();


    public void addUserName(String userName){

        data.add(userName);
    }

    public void removeUserName(String userName){

        data.remove(userName);
    }
    public void displayUserName(){
        for (String item:data) {
            System.out.println(item);
        }
    }

    public void containsUserName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name: ");
        String username = scanner.nextLine();
        if(data.contains(username)){
            System.out.println("Username already exists!");
        }
    }




}
