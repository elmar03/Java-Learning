package MentorLesson25.Task2;

import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("David","Richard","Thomas","David","Thomas","Kevin",
                "Anthony","Matthew","Donald");
        Set<String> uniques = new LinkedHashSet<>(names);
        System.out.println("Names: "+uniques);
        System.out.println("Size: "+uniques.size());



    }
}
