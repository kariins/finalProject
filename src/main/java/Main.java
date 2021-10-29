import Hangman.Game;
import Hangman.HangmanTree;
import Hangman.Words;

import java.util.Scanner;

public class Main {
    private String currentWord;
    private String userWord = "";
    private String userInput = "";
    private int mistakes = 0;
    private Scanner scanner = new Scanner(System.in);
    private boolean gameStarted = false;


    Words words = new Words();
    Game game = new Game();
    HangmanTree hangmanTree =new HangmanTree();

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }

    void showMenu() {

        do {
            if (!gameStarted) {
                System.out.println("\nWelcome to Hangman, are you ready to play?");
                System.out.println("\nEnter Play to start game");
                System.out.println("\nEnter Quit to end program...");

                System.out.println("Choose an option");
            }
            userInput = scanner.nextLine();

            switch (userInput) {
                case "quit", "Quit":
                    System.out.println("Exiting Application");
                    break;
                case "play", "Play":
                    System.out.println("New game");
                    playGame();
                    break;
                default:
                    System.out.println("Next step");
                    newStep();
                    break;
            }
        } while (!userInput.equals("Quit"));
        return;
    }

    public void playGame() {
        gameStarted = true;
        currentWord = words.randomWord();

        System.out.println("The word is:" + currentWord);
        for (int i = 0; i <= currentWord.length() - 1; i++) {
            userWord = userWord.concat("_");
        }
        System.out.println(userWord);
    }

    private void newStep() {
        boolean foundLetter = false;
        if (userInput.length() == 1) {
            System.out.println("This is a letter");
            char[] currentWordArray = currentWord.toCharArray();
            char[] userWordArray = userWord.toCharArray();

            for (int i = 0; i < currentWordArray.length; i++) {
                if (currentWordArray[i] == userInput.charAt(0)) {
                    userWordArray[i] = userInput.charAt(0);
                    userWord = new String(userWordArray);
                    foundLetter = true;
                }

            }
            if (!foundLetter) {
                System.out.println("Incorrect letter and try again");
                mistakes++;
                String wrong1 = hangmanTree.switchMethod(0+mistakes);
                System.out.println(wrong1);

            }

            if (userInput.length() == currentWord.length()) {
                System.out.println("This is a word");
                if (userInput.equals(currentWord)) {
                    System.out.println("Correct!!");
                }
            }

            System.out.println(userWord);

            //
        }
    }
}
