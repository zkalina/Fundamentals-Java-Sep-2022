package arrays.exercise;

import java.util.Scanner;

public class P3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
           String numbers[] = scanner.nextLine().split(" ");
            String firstNumber = numbers[0];
            String secondNumber = numbers[1];

            if(i % 2 == 0) {
             secondArr[i] = firstNumber;
             firstArr[i] = secondNumber;
          }else{
                firstArr[i] = firstNumber;
               secondArr[i] = secondNumber;
            }
        }

        System.out.println(String.join(" ", secondArr));
        System.out.println(String.join(" ", firstArr));
    }
}
