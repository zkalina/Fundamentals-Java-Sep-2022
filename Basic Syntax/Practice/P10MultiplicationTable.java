package basicsyntax.practice;

import java.util.Scanner;
public class P10MultiplicationTable {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int times = 1; times <= 10; times++) {

            System.out.printf("%d X %d = %d%n", num, times, num * times);

        }
    }
}
