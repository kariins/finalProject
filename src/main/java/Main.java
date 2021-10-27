import Hangman.Controller;
import Hangman.HangmanTree;
import Hangman.Words;

import java.util.Scanner;

public class Main {
   Controller controller = new Controller();
    public static void main(String[] args) {
        Main main = new Main();

        main.showMenu();
    }

    void showMenu() {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        do {
            System.out.println("\nWelcome to Hangman, are you ready to play?");
            System.out.println("\nEnter Play to start game");
            System.out.println("\nEnter Quit to end program...");

            System.out.println("Choose an option");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "quit", "Quit":
                    System.out.println("Exiting Application");
                    break;
                case "play", "Play":
                    System.out.println("New game");
                    newGame();
                    break;
                default:
                    break;
            }
        } while (!userInput.equals("Quit"));
        return;
    }

    void newGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The word is:");
        Controller controller = new Controller();
        HangmanTree hangmanTree = new HangmanTree();
        String words = Words.randomWord();
        for (int i=1;i<=words.length();i++)
            System.out.print("_ ");
        System.out.println("\nGuess letter");
        System.out.println(words);




    }
}