package midExam.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int countMoves = 0;
        while (!input.equals("end")) {
            String[] commandData = input.split(" ");
            int index1 = Integer.parseInt(commandData[0]);
            int index2 = Integer.parseInt(commandData[1]);
            if (index1 < 0 || index1 > numbersList.size()
                    || index2 < 0 || index2 > numbersList.size()) {
                numbersList.add(numbersList.size() / 2, numbersList.get(0));
                numbersList.add(numbersList.size() / 2, numbersList.get(0));
                System.out.println("Invalid input. Adding additional elements to the board");

            } else if (numbersList.get(index1).equals(numbersList.get(index2))) {
                numbersList.remove(index1);
                numbersList.remove(index2);
                countMoves++;

                System.out.printf("Congrats! You have found matching elements - %d!%n", numbersList.get(index1));

            } else if (!numbersList.get(index1).equals(numbersList.get(index2))) {
                System.out.println("Try again!");

            }
            input = scanner.nextLine();
        }

            if(numbersList.isEmpty()){
                System.out.println("Sorry you lose :(");
            }else{
                System.out.printf("You have won in %d turns!%n", countMoves);
            }

        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }
}
