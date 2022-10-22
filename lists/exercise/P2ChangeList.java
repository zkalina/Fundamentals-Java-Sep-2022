package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while(!input.equals("end")){
            String[] commandData = input.split(" ");
            String command = commandData[0];
            switch (command) {
                case "Delete":
                    int elementToDelete = Integer.parseInt(commandData[1]);
//                    for (int i = 0; i < numbersList.size(); i++) {
//                        if(elementToDelete == numbersList.get(i)){
//                            numbersList.remove(i);
//                        }
//                    }
                    numbersList.removeAll(Arrays.asList(elementToDelete));
                    break;
                case "Insert":
                    int elementToInsert = Integer.parseInt(commandData[1]);
                    int indexToInsert = Integer.parseInt(commandData[2]);
                    numbersList.add(indexToInsert, elementToInsert);
                    break;
            }
            input = scanner.nextLine();
        }
        for (int number : numbersList) {
            System.out.print(number + " ");
        }
    }
}
