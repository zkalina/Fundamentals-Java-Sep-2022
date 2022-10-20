package lists.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                    .map(e -> Integer.parseInt(e))
                                    .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")){
            String[] commandArr = input.split(" ");
            String command = (commandArr[0]);
            switch(command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numberToAdd);
                  break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(commandArr[1]);
                    numbersList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int numberToRemoveAtIndex = Integer.parseInt(commandArr[1]);
                    numbersList.remove(numberToRemoveAtIndex);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt(commandArr[2]);
                    numbersList.add(indexToInsert, numberToInsert);
                    break;
            }
                input = scanner.nextLine();
        }
        for (int item : numbersList) {
            System.out.print(item + " ");

//            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
