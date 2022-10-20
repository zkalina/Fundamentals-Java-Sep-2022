package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P6EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer :: parseInt)
                        .toArray();

            boolean isValid = false;
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += numbersArr[j];
            }
            for (int k = i + 1; k <= numbersArr.length - 1; k++) {
                rightSum += numbersArr[k];
            }
            if (leftSum == rightSum){
                isValid = true;
                System.out.println(i);
                break;
            }
//            10 5 5 99 3 4 2 5 1 1 4
        }

        if (!isValid) {
            System.out.println("no");
        }

    }
}
