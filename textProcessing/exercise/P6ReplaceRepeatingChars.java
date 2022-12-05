package textProcessing.exercise;

import java.util.Scanner;

public class P6ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder();


        char firstSymbol = input.charAt(0);
        text.append(firstSymbol);

        for (int i = 1; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if(currentSymbol != firstSymbol){
                text.append(currentSymbol);
                firstSymbol = currentSymbol;
            }
        }
        System.out.println(text);

    }
}

//        for (int i = 0; i < input.length(); i++) {
//            char currentSymbol = input.charAt(i);
//            char nextSymbol = input.charAt(i + 1);
//
//            if  (currentSymbol != nextSymbol){
//                    text.append(currentSymbol);
//
//
//            }
//
//        }
//
//        System.out.println(text);



