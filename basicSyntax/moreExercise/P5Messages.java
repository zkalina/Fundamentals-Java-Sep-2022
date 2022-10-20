package basicSyntax.moreExercise;

import java.util.Scanner;

public class P5Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();


        for (int i = 1; i <= rows; i++) {
            for (int row = 0; row <= input.length() - 1; row++) {

                char currentSymbol = ' ';
                if (input.equals("2")) {
                    currentSymbol = 'a';
                }
                if (input.equals("22")) {
                    currentSymbol = 'b';
                }
                if (input.equals("222")) {
                    currentSymbol = 'c';
                } else if (input.equals("3")) {
                    currentSymbol = 'd';
                }
                if (input.equals("33")) {
                    currentSymbol = 'e';
                }
                if (input.equals("333")) {
                    currentSymbol = 'f';
                } else if (input.equals("4")) {
                    currentSymbol = 'g';
                }
                if (input.equals("44")) {
                    currentSymbol = 'h';
                }
                if (input.equals("444")) {
                    currentSymbol = 'i';
                } else if (input.equals("5")) {
                    currentSymbol = 'j';
                }
                if (input.equals("55")) {
                    currentSymbol = 'k';
                }
                if (input.equals("555")) {
                    currentSymbol = 'l';
                } else if (input.equals("6")) {
                    currentSymbol = 'm';
                }
                if (input.equals("66")) {
                    currentSymbol = 'n';
                }
                if (input.equals("666")) {
                    currentSymbol = 'o';
                } else if (input.equals("7")) {
                    currentSymbol = 'p';
                }
                if (input.equals("77")) {
                    currentSymbol = 'q';
                }
                if (input.equals("777")) {
                    currentSymbol = 'r';
                }
                if (input.equals("7777")) {
                    currentSymbol = 's';
                } else if (input.equals("8")) {
                    currentSymbol = 't';
                }
                if (input.equals("88")) {
                    currentSymbol = 'u';
                }
                if (input.equals("888")) {
                    currentSymbol = 'v';
                } else if (input.equals("9")) {
                    currentSymbol = 'w';
                }
                if (input.equals("99")) {
                    currentSymbol = 'x';
                }
                if (input.equals("999")) {
                    currentSymbol = 'y';
                }
                if (input.equals("9999")) {
                    currentSymbol = 'z';
                } else if (input.equals("0")) {
                    currentSymbol = ' ';
                }

                System.out.print(currentSymbol);

            }
        }
    }
}
