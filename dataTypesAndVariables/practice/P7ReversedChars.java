package dataTypesAndVariables.practice;

import java.util.Scanner;

public class P7ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLine = scanner.nextLine().charAt(0);
        char secondLine = scanner.nextLine().charAt(0);
        char thirdLine = scanner.nextLine().charAt(0);

        String chars = String.format("%c %c %c", thirdLine, secondLine, firstLine);

        System.out.println(chars);

    }
}
