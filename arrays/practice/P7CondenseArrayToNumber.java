package arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class P7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numsArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer :: parseInt)
                        .toArray();

        int[] condensedNumbers = new int[numsArr.length - 1];
        int currentSum = 0;
        for (int i = 0; i < numsArr.length; i++){
            currentSum = numsArr[i] + numsArr[i + 1];
        }for (int i = 0; i <= condensedNumbers.length; i++){
            condensedNumbers[i] = currentSum;
        }
    }
}
