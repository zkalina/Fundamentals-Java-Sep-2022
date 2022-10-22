package lists.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P3HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> namesList = new ArrayList<>();

        for (int i = 1; i <= commandsCount; i++){
            String input = scanner.nextLine();
            String[] commandData = input.split(" ");
            String name = commandData[0];

                   if (commandData.length == 3) {
                       if (!namesList.contains(name)) {
                           namesList.add(name);
                       } else {
                           System.out.printf("%s is already in the list!%n", name);
                       }
                   }

                   if(commandData.length == 4) {
                       if (namesList.contains(name)) {
                           namesList.remove(name);
                       } else {
                           System.out.printf("%s is not in the list!%n", name);
                       }
                   }
        }
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
