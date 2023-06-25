import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Появился", "значит", "в", "зоне", "Черный", "сталкер");

        String sentence = words.stream().reduce("", (a, b) -> a + b + " ").trim();

        System.out.println("List of words: " + words);
        System.out.println("Sentence: " + sentence);
    }
}