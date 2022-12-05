package associativeArrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class P4WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" ")).
                        filter(word -> word.length() % 2 == 0).
                        toArray(String[] ::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
