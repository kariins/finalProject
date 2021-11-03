import Hangman.HangmanTree;
import Hangman.Words;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    int mistakes = 0;
    private String currentWord;
    private String userWord = "";
    private String userInput = "";
    private Scanner scanner = new Scanner(System.in);
    private boolean gameStarted = false;


    Words words = new Words();

    HangmanTree hangmanTree = new HangmanTree();

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();

    }

    void showMenu() {

        do {
            if (!gameStarted) {
                System.out.println("\nWelcome to Hangman, are you ready to play?");
                System.out.println("\n Play to start game");
                System.out.println("\n Quit to end program...");

                System.out.println("Choose an option");
            }

            userInput = scanner.nextLine();

            switch (userInput) {
                case "quit":
                case "Quit":
                case "QUIT":
                    System.out.println("Exiting Application");
                    break;
                case "play":
                case "Play":
                case "PLAY":
                    System.out.println("New game");
                    playGame();
                    break;
                default:
                    System.out.println("Next step");
                    newStep();
                    break;
            }
        } while (!userInput.equalsIgnoreCase("Quit"));
        return;
    }

    public void playGame() {
        gameStarted = true;
        currentWord = words.randomWord();
        userWord = "";
        mistakes = 0;

        System.out.println("You can guess the whole word or guess by letter");
        System.out.println("+++++++The word is:++++++++" + currentWord);


        for (int i = 0; i <= currentWord.length() - 1; i++) {
            userWord = userWord.concat("_");
        }
        System.out.println("New game started");
        System.out.println(userWord);
    }

    private void newStep() {
        boolean foundLetter = false;
        String userEntered = userInput.toUpperCase(Locale.ROOT);

        if (userEntered.length() == 1) {
            System.out.println("This is a letter");
            char[] currentWordArray = currentWord.toCharArray();
            char[] userWordArray = userWord.toCharArray();

            for (int i = 0; i < currentWordArray.length; i++) {
                if (currentWordArray[i] == userEntered.charAt(0)) {
                    userWordArray[i] = userEntered.charAt(0);
                    userWord = new String(userWordArray);
                    foundLetter = true;
                    System.out.println("Correct guess");
                    System.out.println(userWord);
                }

            }
            // guess by letter, if all letters are correct;
            if (userWord.contains("_") == false) {
                System.out.println("This is a correct word");
                System.out.println("YOU WIN!!");
                System.out.println("Would you like to continue? Y/N");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    playGame();
                } else {
                    gameStarted = false;
                    showMenu();
                }
            }
            //guess by letter if mistakes are equal to 5;
            if (!foundLetter) {

                System.out.println("Incorrect letter and try again");
                mistakes++;
                hangmanTree.draw(mistakes);

            }
            if (mistakes == 5) {
                // hangmanTree.draw(mistakes);
                System.out.println("Game Over");
                System.out.println("The correct word was: " + currentWord);
                System.out.println("Would you like to continue? Y/N");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    playGame();

                } else {
                    gameStarted = false;
                    showMenu();
                }
            }
        }
        // guess by the whole word ;
        if (userEntered.length() == currentWord.length()) {

            if (userEntered.equals(currentWord)) {
                System.out.println("This is a correct word");
                System.out.println("YOU WIN!!");

            } else {
                hangmanTree.draw(5);
                System.out.println("GAME OVER, This is incorrect word!!!");
                System.out.println("The correct word was " + currentWord);
            }
            System.out.println("Would you like to continue? Y/N");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                playGame();
            } else {
                gameStarted = false;
                showMenu();
            }
        }
    }

}