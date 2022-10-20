package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1 7 6 2 19 23
//        8
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++){
            int currentNum = array[i];

            for (int nextIn = i + 1; nextIn <= array.length - 1; nextIn++){
            int nextNum = array[nextIn];
            int sum = currentNum + nextNum;
            if(sum == magicSum) {
                System.out.printf("%d %d%n", array[i], array[nextIn]);
                }
            }
        }
    }
}
