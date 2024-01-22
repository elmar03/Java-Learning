package UniqueFruits;

import java.util.HashSet;
import java.util.Set;

public class UniqueFruits {
    public static void main(String[] args) {
        Set<String > setA= new HashSet<>();
        setA.add("Apple");
        setA.add("Banana");
        setA.add("Orange");
        setA.add("Kiwi");

        Set<String> setB = new HashSet<>();
        setB.add("Orange");
        setB.add("Kiwi");
        setB.add("Grape");
        setB.add("Pear");

        Set<String> union = new HashSet<>(setA);
        union.addAll(setB);
        Set<String> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        Set<String> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        Set<String> difference2 = new HashSet<>(setB);
        difference2.removeAll(setA);

        System.out.println("Set A values: " + setA);
        System.out.println("Set B values: " + setB);
        System.out.println("Union : " + union);
        System.out.println("Intersection : " + intersection);
        System.out.println("Difference: " + difference);
        System.out.println("Difference2: " + difference2);


    }


}
