package basicSyntax.moreExercise;

import java.util.Scanner;

public class P3GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double gamePrice = 0;

        while(!input.equals("Game Time")){

            switch (input){
                case "OutFall 4":
                    if(currentBalance >= 39.99){
                        gamePrice += 39.99;
                        currentBalance -= 39.99;
                        System.out.println("Bought OutFall 4");
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if(currentBalance >= 15.99){
                        gamePrice += 15.99;
                        currentBalance -= 15.99;
                        System.out.println("Bought CS: OG");
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if(currentBalance >= 19.99){
                        gamePrice += 19.99;
                        currentBalance -= 19.99;
                        System.out.println("Bought Zplinter Zell");
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if(currentBalance >= 59.99){
                        gamePrice += 59.99;
                        currentBalance -= 59.99;
                        System.out.println("Bought Honored 2");
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if(currentBalance >= 29.99){
                        gamePrice += 29.99;
                        currentBalance -= 29.99;
                        System.out.println("Bought RoverWatch");
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if(currentBalance >= 39.99){
                        gamePrice += 39.99;
                        currentBalance -= 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    }else{
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }

            input = scanner.nextLine();
        }
        if(currentBalance == 0){
            System.out.println("Out of money!");
        }else{

            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", gamePrice, currentBalance);
        }
    }
}
