package Hangman;

import java.util.ArrayList;
import java.util.Random;

public class Words {

    private static ArrayList<String> dictionary = new ArrayList<String>();
    private static Random random = new Random();

    public static ArrayList<String> getDictionary() {
        return dictionary;
    }

    private static void generateWords() {
        String[] words = {"ANSWER", "AUDIENCE",
                "TEMPERATURE", "TRIANGLE",
                "UNKNOWN", "WORKER", "YOUTHFUL"};

        for (int i = 0; i < words.length; i++)
            dictionary.add(words[i]);
    }

    public static String randomWord() {
        generateWords();
        String hiddenWord= dictionary.get((0));
        return hiddenWord;
        //return (String) dictionary.get(random.nextInt(dictionary.size()));

    }
}
