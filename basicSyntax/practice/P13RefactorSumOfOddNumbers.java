package basicSyntax.practice;

import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("Sum: %d%n", sum);

//        for (int i = 0; i < num; i++) {
//            System.out.println(2 * i + 1);
//            sum += i * 2 + 1;
//        }
//        System.out.printf("Sum: %d%n", sum);

    }
}
