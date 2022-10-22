package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P4ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                    .map(Integer :: parseInt)
                                    .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("End")){
            String[] commandData = input.split("\\s+");
            String command = commandData[0];
            switch (command){
                case "Add":
                    int numberToAdd = Integer.parseInt(commandData[1]);
                        numbersList.add(numberToAdd);
                    break;

                case "Insert":
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int indexToInsert = Integer.parseInt(commandData[2]);
                    if (indexToInsert >= 0 && indexToInsert <= numbersList.size()) {
                        numbersList.add(indexToInsert, numberToInsert);
                    }else{
                        System.out.println("Invalid index");
                    }

                    break;

                case "Remove":
                    int removeIndex = Integer.parseInt(commandData[1]);
                    if (removeIndex >= 0 && removeIndex <= numbersList.size()) {
                        numbersList.remove(removeIndex);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    if(commandData[1].equals("left")){
                        int leftCount = Integer.parseInt(commandData[2]);
                        for (int time = 1; time <= leftCount; time++) {
                            int firstNum = numbersList.get(0);
                            numbersList.remove(0);
                            numbersList.add(firstNum);
                        }
                    }else {
                        int rightCount = Integer.parseInt(commandData[2]);
                        for (int time = 1; time <= rightCount; time++) {
                            int lastNum = numbersList.get(numbersList.size() - 1);
                            numbersList.remove(numbersList.size() - 1);
                            numbersList.add(0, lastNum);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (int num : numbersList) {
            System.out.print(num + " ");
        }

    }
}
