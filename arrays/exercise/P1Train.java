package arrays.exercise;

import java.util.Scanner;

public class P1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());
            arr[i] = peopleInWagon;
            sum += peopleInWagon;
            System.out.print(peopleInWagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
