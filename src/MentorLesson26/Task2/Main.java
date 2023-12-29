package MentorLesson26.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("World","Combat Sambo","Mixed Martial Arts",
                "UFC","Motivation","Hello","Random","Congrats","Heavyweight");

        System.out.println(input.stream().filter(c -> c.length() <= 10).
                sorted((s1, s2) -> Integer.compare(s2.length(), s1.length())).toList());
//
//        List<String> descendentSorted = input.stream().filter(c->c.length()<=10).
//                sorted(Comparator.comparingInt(String::length).reversed()).toList();
//        System.out.println(descendentSorted);
    }
}
