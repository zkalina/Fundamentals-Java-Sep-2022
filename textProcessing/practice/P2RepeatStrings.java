package textProcessing.practice;

import java.util.Scanner;

public class P2RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArray = scanner.nextLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : wordsArray) {
            int wordsLength = word.length();
            for (int i = 0; i < wordsLength; i++) {
                result.append(word);
            }
        }
        System.out.printf("%s", result.toString());
    }
}
