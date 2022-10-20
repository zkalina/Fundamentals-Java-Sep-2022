package arrays.practice;

import java.util.Scanner;

public class P4ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letters = scanner.nextLine().split(" ");

//        for (int i = letters.length - 1; i >= 0; i--) {
//              System.out.print(letters[i] + " ");
//        }

        for (int i = 0; i < letters.length / 2; i++) {
            String temp = letters[i];
            letters[i] = letters[letters.length - 1 - i];
            letters[letters.length - 1 - i] = temp;
        }
        System.out.println(String.join(" ", letters));
    }
}
