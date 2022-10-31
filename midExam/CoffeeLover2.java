package midExam;

import java.util.*;
import java.util.stream.Collectors;

public class CoffeeLover2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeesList = Arrays.stream(scanner.nextLine().split(" "))
                                .collect(Collectors.toList());
        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commandsCount; i++) {
            String[] commandData = scanner.nextLine().split(" ");
            String command = commandData[0];

            switch (command) {
                case "Include":
                    String coffeeKind = commandData[1];
                    coffeesList.add(coffeeKind);
                    break;

                case "Remove":
                    int numberOfCoffeesToRemove = Integer.parseInt(commandData[2]);
                    if (commandData[1].equals("first")) {
                        for (int index = 0; index < numberOfCoffeesToRemove; index++) {
                            coffeesList.remove(0);
                        }
                    } else if (commandData[1].equals("last")) {
                        for (int index = 0; index < numberOfCoffeesToRemove; index++) {
                            coffeesList.remove(coffeesList.size() - 1);
                        }
                    }
                    break;

                case "Prefer":
                    int coffeeIndexToReplace = Integer.parseInt(commandData[1]);
                    int coffeeIndex2ToReplace = Integer.parseInt(commandData[2]);

                        if(coffeeIndexToReplace >= 0 && coffeeIndexToReplace <= coffeesList.size() - 1
                            && coffeeIndex2ToReplace >=0 && coffeeIndex2ToReplace <= coffeesList.size() - 1){
                            Collections.swap(coffeesList, coffeeIndexToReplace, coffeeIndex2ToReplace);
                        }else{
                            break;
                        }
                    break;
                case "Reverse":
                    Collections.reverse(coffeesList);
                    break;
            }
        }
        System.out.println();
        System.out.println("Coffees:");

        for (String coffee : coffeesList) {
            System.out.print(coffee + " ");
        }
    }
}
