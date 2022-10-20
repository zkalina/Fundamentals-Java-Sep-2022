package arrays.exercise;

import java.util.Scanner;

public class P2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                String secondElement = secondArray[i];
                String firstElement = firstArray[j];

                if (secondElement.equals(firstElement)){
                    System.out.print(secondElement + " ");
                }
            }



        }

    }
}
