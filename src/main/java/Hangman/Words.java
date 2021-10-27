package Hangman;

import java.util.ArrayList;
import java.util.Random;

public class Words {
    //    public String[] words = {
//            "cat", "dog", "class"
//};
//
//    public void chooseWord() {
//        // choose a random word
//        Random random = new Random();
//        int range = random.nextInt(words.length());
//        String word = words.get(range);
//        return word;
//    }
    private static ArrayList<String> dictionary = new ArrayList<String>();
    private static Random random = new Random();

    private static void generateWords() {
        String[] words = {"ANSWER", "AUDIENCE",
                "TEMPERATURE", "TRIANGLE",
                "UNKNOWN", "WORKER", "YOUTHFUL"};

        for (int i = 0; i < words.length; i++)
            dictionary.add(words[i]);
    }

    public static String randomWord() {
        generateWords();
        return (String) dictionary.get(random.nextInt(dictionary.size()));

    }
}
