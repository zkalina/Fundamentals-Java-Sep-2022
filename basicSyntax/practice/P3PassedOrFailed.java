package basicSyntax.practice;

import java.util.Scanner;

public class P3PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade < 3.00){
            System.out.println("Failed!");
        }else {
            System.out.println("Passed!");
        }

    }
}
