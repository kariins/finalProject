package Hangman;

public class HangmanTree {
    int maxErrors=5;
    public static String switchMethod(int maxErrors) {
        switch (maxErrors) {
            case 1:
                return drawFirst();
            case 2:
                return drawSecond();
            case 3:
                return drawHead();
            case 4:
                return drawBody();
            case 5:
                return drawHangman();

            default:
                return "GAME OVER";
        }
    }



    private static String drawHangman() {
        return  "\n _________     "+
                "\n|         |    "+
                "\n|         0    "+
                "\n|        /|\\  "+
                "\n|        / \\  "+
                "\n|              "+
                "\n|______________";
    }
    private static String drawBody() {
        return  "\n _________     "+
                "\n|         |    "+
                "\n|         0    "+
                "\n|        /|\\  "+
                "\n|              "+
                "\n|              "+
                "\n|______________";
    }

    private static String drawHead() {
        return  "\n _________     "+
                "\n|         |    "+
                "\n|         0    "+
                "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|______________";
    }
    private static String drawSecond() {
        return  "\n _________     "+
                "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|______________";
    }
    private static String drawFirst() {
        return  "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|              "+
                "\n|______________";
    }

}
