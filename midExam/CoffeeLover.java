package midExam;

import java.util.*;
import java.util.stream.Collectors;

public class CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeesList = Arrays.stream(scanner.nextLine().split(" "))
                                    .collect(Collectors.toList());
        int commandsNumber = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        for (int i = 1; i <= commandsNumber; i++) {
            String[] commandData = input.split(" ");
            String command = commandData[0];

            if(command.equals("Include")){
                String coffeeKindToAdd = commandData[1];
                coffeesList.add(coffeeKindToAdd);
                break;


            }else if (command.equals("Remove")){
                String firstOrLast = commandData[1];
                int numberOfCoffeesToRemove = Integer.parseInt(commandData[2]);

                if(firstOrLast.equals("first")){
                    for (int j = 0; j < coffeesList.size(); j++) {
                        coffeesList.remove(numberOfCoffeesToRemove);
                    }
                }else{
                    coffeesList.remove(numberOfCoffeesToRemove);
                    for (int k = coffeesList.size() - 1; k >= 0; k--) {
                        coffeesList.remove(k);
                    }
                } if(numberOfCoffeesToRemove > coffeesList.size()){
                    break;
                }
                break;

            }else if (command.equals("Prefer")){
                int coffeePlace1ToChange = Integer.parseInt(commandData[1]);
                int coffeePlace2ToChange = Integer.parseInt(commandData[2]);

                if(coffeePlace1ToChange >= 0 && coffeePlace1ToChange <= coffeesList.size()
                   && coffeePlace2ToChange >= 0 && coffeePlace2ToChange <= coffeesList.size()){
                   String newPLace =  coffeesList.get(coffeePlace1ToChange);
                    coffeesList.set(coffeePlace2ToChange, newPLace);
                    String newPlace2 = coffeesList.get(coffeePlace2ToChange);
                    coffeesList.set(coffeePlace1ToChange, newPlace2);
                }else{
                    break;
                }



            }else if(command.equals("Reverse")){
                Collections.reverse(coffeesList);
                break;
            }
        }
        System.out.println();
        System.out.printf("Coffees:%n");
        for ( String coffeeType: coffeesList) {

            System.out.printf("%s ", coffeeType);
        }
    }
}
