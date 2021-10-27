package Hangman;

public class HangmanTree {
    int maxErrors=5;

    public void draw() {

        if (maxErrors == 5) {
            System.out.println(" _________     ");
            System.out.println("|         |    ");
            System.out.println("|         0    ");
            System.out.println("|        /|\\  ");
            System.out.println("|        / \\  ");
            System.out.println("|              ");
            System.out.println("|______________");
        }

        if (maxErrors == 4) {
            System.out.println(" _________     ");
            System.out.println("|         |    ");
            System.out.println("|         0    ");
            System.out.println("|        /|\\  ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|______________");
        }

        if (maxErrors == 3) {
            System.out.println(" _________     ");
            System.out.println("|         |    ");
            System.out.println("|         0    ");
            System.out.println("|        /|\\  ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|______________");
        }

        if (maxErrors == 3) {
            System.out.println(" _________     ");
            System.out.println("|         |    ");
            System.out.println("|         0    ");
            System.out.println("|        / \\  ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|______________");
        }

        if (maxErrors == 2) {
            System.out.println(" _________     ");
            System.out.println("|         |    ");
            System.out.println("|         0    ");
            System.out.println("|        /     ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|______________");
        }

        if (maxErrors == 1) {
            System.out.println(" _________     ");
            System.out.println("|         |    ");
            System.out.println("|         0    ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|______________");
        }

        if (maxErrors == 0) {
            System.out.println(" _________     ");
            System.out.println("|             ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|              ");
            System.out.println("|______________");
        }

    }
}
