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
        String[] words = new String[] {"APPLE","ORANGE",
                "PINEAPPLE", "MELON",
                "MANGO", "BANANA", "PEAR"};

        for (int i = 0; i < words.length; i++)
            dictionary.add(words[i]);
    }

    public static String randomWord() {
        generateWords();
        String hiddenWord= dictionary.get(random.nextInt(dictionary.size()));
        return hiddenWord;
    }
}
