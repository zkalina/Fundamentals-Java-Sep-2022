package basicSyntax.exercise;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetTotalPrice = Math.ceil(lostGamesCount / 2) * headsetPrice;
        double mouseTotalPrice = Math.ceil(lostGamesCount / 3) * mousePrice;
        double keyboardTotalPrice = Math.ceil(lostGamesCount / 6) * keyboardPrice;
        double displayTotalPrice = Math.ceil(lostGamesCount / 12) * displayPrice;

        double total = headsetTotalPrice + mouseTotalPrice + keyboardTotalPrice + displayTotalPrice;

        System.out.printf("Rage expenses: %.2f lv.", total);

    }
}
