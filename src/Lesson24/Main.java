package Lesson24;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,10,-15,112,-49,19,-65,92);
        System.out.println(numbers.stream().filter(x -> x > 0).toList());

        List<Double> numbers2 = Arrays.asList(3.2,10.1,-15.7,95.7,-49.7,19.3,-65.7,92.8);
        System.out.println(numbers2.stream().map(Math::ceil).toList());

        List<String> words = Arrays.asList("Hi","World","Salam","Composure","Up","Downtown","dfdhjfjkfdkj");

        System.out.println(words.stream().filter(c -> c.length() < 5).toList());

        List<Integer>numbers3 = Arrays.asList(105,924,5485,42517,3548,65,487,154);
        System.out.println(numbers3.stream().skip(2).toList());


        OptionalDouble average = words.stream().mapToDouble(b -> b.length()).average();
        System.out.println(average);

        int sum = numbers3.stream().filter(l->l>1000).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
