package textProcessing.exercise;

import java.util.Scanner;

public class P4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("");

        for (int i = 0; i < text.length; i++) {
            for (char symbol : text[i].toCharArray()) {

               int result = symbol + 3;
                char newSymbol = (char)result;
                System.out.print(newSymbol);
            }
        }
        // втори начин
//        for (char symbol : text.toCharArray()) {
//            System.out.print((char)(symbol + 3));
//        }


        // трети начин
//        for (char symbol : text.toCharArray()) {
//            char encryptSymbol = (char)(symbol + 3); //криптирания символ
//            encryptedText.append(encryptSymbol);
//        }
    }
}
