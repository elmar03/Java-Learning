package MentorLesson26.Example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> input = Arrays.asList("Necəsən","100000000000","HakunaMatata","14564568975324","long","Abdcgdjfke");


        System.out.println(input.stream().filter(x -> x.length() >= 10).
                sorted((s1,s2)->Integer.compare(s2.length(), s1.length())).toList());
    }
}
