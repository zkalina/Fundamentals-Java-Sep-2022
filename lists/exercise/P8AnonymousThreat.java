package lists.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringsList = Arrays.stream(scanner.nextLine().split(" "))
                                    .collect(Collectors.toList());

        String input = scanner.nextLine();
        String resultMerge = "";
        while (!input.equals("3:1")){
            String[] commandData = input.split(" ");
            String command = commandData[0];

            if(command.equals("merge")){
            int startIndex = Integer.parseInt(commandData[1]);
            int endIndex = Integer.parseInt(commandData[2]);

                for (int i = startIndex; i <= endIndex; i++) {
                      String currentText = stringsList.get(i);
                      resultMerge += currentText;
                    stringsList.remove(startIndex);
                    stringsList.add(startIndex, resultMerge);

                }

        }


            input = scanner.nextLine();
        }
        System.out.println(String.join("", resultMerge));
    }
}
