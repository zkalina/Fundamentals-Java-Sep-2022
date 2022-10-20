package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P9ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

        String command = scanner.nextLine();

        for (int i = 0; i <= array.length - 1; i++){

        while(!command.equals("end")) {

            switch (command) {
                case "swap":
                    int firstIndex = Integer.parseInt(command.split(" ")[1]);
                    int secondIndex = Integer.parseInt(command.split(" ")[2]);

                    break;
                case "multiply":
                    firstIndex = Integer.parseInt(command.split(" ")[1]);
                    secondIndex = Integer.parseInt(command.split(" ")[2]);
                    int result = array[firstIndex] * array[secondIndex];

                    break;
                case "decrease":


                    break;
            }
            command = scanner.nextLine();
            }
        }
    }
}
