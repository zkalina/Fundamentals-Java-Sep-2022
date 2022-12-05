package textProcessing.practice;

import java.util.Scanner;

public class P5DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if(Character.isDigit(character)){
                digits.append(character);
            }else if(Character.isAlphabetic(character)){
                letters.append(character);
            }else{
                symbols.append(character);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
