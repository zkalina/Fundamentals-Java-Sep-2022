package arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class P6EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int sum = 0;
        boolean areIdentical = true;
        int diffIndex = 0;

        for (int i = 0; i < firstArr.length; i++) {
           int firstNum = firstArr[i];
           int secondNum = secondArr[i];

            if (firstNum == secondNum) {
                sum += firstNum;
            } else {
                areIdentical = false;
                diffIndex = i;
                break;
            }
        }
        if(areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else{
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
