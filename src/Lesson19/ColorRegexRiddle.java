package Lesson19;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorRegexRiddle {

    public static void main(String[] args) {
        // Generate a random sentence with colors
        String randomSentence = generateRandomSentence();

        // Define a regex pattern to match common colors
        String colorRegex = "\\b(red|green|blue|yellow|orange|purple|pink)\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(colorRegex, Pattern.CASE_INSENSITIVE);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(randomSentence);

        // Find and print all colors in the sentence
        System.out.println("Random Sentence: " + randomSentence);
        System.out.println("\nColors found:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static String generateRandomSentence() {
        String[] colors = {"red", "green", "blue", "yellow", "orange", "purple", "pink"};
        Random random = new Random();

        StringBuilder sentence = new StringBuilder("Pack my box with five dozen liquor jugs. ");

        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(colors.length);
            sentence.append("The ").append(colors[randomIndex]).append(" cat meows ");
        }

        return sentence.toString();
    }
}

