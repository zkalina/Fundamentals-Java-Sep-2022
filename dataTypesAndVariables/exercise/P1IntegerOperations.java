package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P1IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aNum = Integer.parseInt(scanner.nextLine());
        int bNum = Integer.parseInt(scanner.nextLine());
        int cNum = Integer.parseInt(scanner.nextLine());
        int dNum = Integer.parseInt(scanner.nextLine());

        int sum = ((aNum + bNum) / cNum) * dNum;

        System.out.println(sum);

    }
}
