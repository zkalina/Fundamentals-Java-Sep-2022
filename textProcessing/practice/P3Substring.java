package textProcessing.practice;

import java.util.Scanner;

public class P3Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(wordToRemove);
        while (index != -1) {
            text = text.replace(wordToRemove, "");
            index = text.indexOf(wordToRemove);
        }

        System.out.println(text);

    }
}
