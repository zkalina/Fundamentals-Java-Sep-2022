package basicsyntax.practice;

import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 2);
            sum += i;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
