package basicSyntax.exercise;

import java.util.Scanner;

public class P9Orders {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        double total = 0;
        for (int i = 1; i <= countOfOrders ; i++) {
            double capsulePrice = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            sum = capsulePrice * days * capsulesCount;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
            total += sum;
        }
        System.out.printf("Total: $%.2f", total);

    }
}
