package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                                    .map(Integer :: parseInt)
                                    .collect(Collectors.toList());
        int maxCapacityPerWagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while(!input.equals("end")){
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            if (command.equals("Add")){
                int passengersToAdd = Integer.parseInt(commandArr[1]);
                wagonsList.add(passengersToAdd);
            }else {
                int fitPassengers = Integer.parseInt(commandArr[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    if((wagonsList.get(i) + fitPassengers) <= maxCapacityPerWagon){
                       int newCapacity = wagonsList.get(i) + fitPassengers;
                       wagonsList.set(i, newCapacity);
                       break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (int wagon : wagonsList) {
            System.out.print(wagon + " ");
        }
    }
}
