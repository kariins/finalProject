package Hangman;

public class HangmanTree {

    public String draw(int currentError) {

        switch (currentError) {
            case 1:
                drawFirst();
                break;
            case 2:
                drawSecond();
                break;
            case 3:
                drawHead();
                break;
            case 4:
                drawBody();
                break;
            case 5:
                drawHangman();
                break;
            default:
                System.out.println("");
                break;

        }

        return null;
    }


    private static void drawHangman() {
        String man =
                " \n _________     " +
                        "\n|         |    " +
                        "\n|         0    " +
                        "\n|        /|\\  " +
                        "\n|        / \\  " +
                        "\n|              " +
                        "\n|______________";
        System.out.println(man);
    }

    private static void drawBody() {
        String man =
                " \n _________     " +
                        "\n|         |    " +
                        "\n|         0    " +
                        "\n|        /|\\  " +
                        "\n|              " +
                        "\n|              " +
                        "\n|______________";
        System.out.println(man);
    }

    private static void drawHead() {
        String man =
                " \n _________     " +
                        "\n|         |    " +
                        "\n|         0    " +
                        "\n|              " +
                        "\n|              " +
                        "\n|              " +
                        "\n|______________";
        System.out.println(man);
    }

    private static void drawSecond() {
        String man =
                " \n _________     " +
                        "\n|              " +
                        "\n|              " +
                        "\n|              " +
                        "\n|              " +
                        "\n|              " +
                        "\n|______________";
        System.out.println(man);
    }

    private static void drawFirst() {
        String man = "\n|              " +
                "\n|              " +
                "\n|              " +
                "\n|              " +
                "\n|              " +
                "\n|              " +
                "\n|______________";
        System.out.println(man);
    }


}