package basicSyntax.exercise;

import java.util.Scanner;

public class P2Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean isDivisible = false;
        int divisor = 0;

        if (num % 10 == 0) {
            isDivisible = true;
            divisor = 10;
        } else if (num % 7 == 0) {
            isDivisible = true;
            divisor = 7;
        } else if (num % 6 == 0) {
            isDivisible = true;
            divisor = 6;
        } else if (num % 3 == 0) {
            isDivisible = true;
            divisor = 3;
        } else if (num % 2 == 0) {
            isDivisible = true;
            divisor = 2;
        }
        if (isDivisible){
            System.out.println("The number is divisible by " + divisor);
        }else{
            System.out.println("Not divisible");
        }
    }
}
