package arrays.practice;

import java.util.Scanner;

public class P2PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int rows = 0; rows < n; rows++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            numbers[rows] = currentNumber;
        }

            for (int num = numbers.length - 1; num >= 0 ; num--) {
                System.out.print(numbers[num] + " ");
            }
    }
}
