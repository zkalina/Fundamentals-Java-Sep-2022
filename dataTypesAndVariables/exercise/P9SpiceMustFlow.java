package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYieldFirstDay = Integer.parseInt(scanner.nextLine());

        int countDays = 0;
        int totalAmount = 0;
        while(startingYieldFirstDay >= 100){
            int spices = startingYieldFirstDay - 26;
            totalAmount += spices;

            countDays++;

            startingYieldFirstDay = startingYieldFirstDay - 10;

            }
                if(totalAmount >= 26){
                    totalAmount -= 26;
                }

        System.out.println(countDays);
        System.out.println(totalAmount);

    }
}
