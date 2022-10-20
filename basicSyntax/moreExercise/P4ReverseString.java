package basicSyntax.moreExercise;

import java.util.Scanner;

public class P4ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reversedWord = "";
        for (int reversed = input.length() - 1; reversed >= 0; reversed--) {
            char currentSymbol = input.charAt(reversed);
            reversedWord += currentSymbol;
        }
        System.out.println(reversedWord);
    }
}
