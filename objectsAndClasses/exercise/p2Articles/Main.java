package objectsAndClasses.exercise.p2Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String commandData = scanner.nextLine();
            String command = commandData.split(": ")[0];
            String data = commandData.split(" ")[1];
            String


        }
    }
}
