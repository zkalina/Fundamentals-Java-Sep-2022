package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P2SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int currentDigit = 0;
        int sum = 0;
        while(number != 0){
           currentDigit = number % 10;
            sum += currentDigit;
           number = number / 10;


       }
        System.out.println(sum);

    }
}
