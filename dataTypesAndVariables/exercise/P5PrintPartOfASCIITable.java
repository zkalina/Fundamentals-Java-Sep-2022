package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P5PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCharacter = Integer.parseInt(scanner.nextLine());
        int endCharacter = Integer.parseInt(scanner.nextLine());

        for (int symbol = startCharacter; symbol <= endCharacter; symbol++) {
            char character = (char)symbol;
            System.out.print(character + " ");

        }
    }
}
