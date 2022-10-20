package lists.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P5ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer :: parseInt)
                                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while(!input.equals("end")){
            String[] commandArr = input.split(" ");
            switch (commandArr[0]){
                case "Contains":
                    int containsNumber = Integer.parseInt(commandArr[1]);
                    if (numbersList.contains(containsNumber)){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if(commandArr[1].equals("even")) {
                        for (int evenNumber : numbersList) {
                            if (evenNumber % 2 == 0)
                                System.out.print(evenNumber + " ");
                        }
                        System.out.println();
                    }else{
                        for (int oddNumber : numbersList) {
                            if (oddNumber % 2 != 0)
                                System.out.print(oddNumber + " ");
                        }
                    }
                    break;

                case "Get":

                   int sum = 0;
                    for (Integer integer : numbersList) {
                        sum += integer;
                    }
                    System.out.println();
                    System.out.println(sum);
                    break;

                case"Filter":
                    String condition = commandArr[1];
                    int number = Integer.parseInt(commandArr[2]);

                    for (int currentNumber : numbersList) {
                        switch (condition) {
                            case ">=":
                                if (currentNumber >= number) {
                                    System.out.print(currentNumber + " ");

                                }
                                break;
                            case "<=":
                                if (currentNumber <= number) {
                                    System.out.print(currentNumber + " ");
                                }
                                break;
                            case ">":
                                if (currentNumber > number) {
                                    System.out.print(currentNumber + " ");
                                }
                                break;
                            case "<":
                                if (currentNumber < number) {
                                    System.out.print(currentNumber + " ");
                                }
                                break;
                        }

                    }
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();

        }

    }
}
