package basicSyntax.exercise;

import java.util.Scanner;

public class P3Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;

        switch(dayOfTheWeek){
            case "Friday":
                if (typeOfPeople.equals("Students")){
                    price = 8.45 * groupOfPeople;
                }else if (typeOfPeople.equals("Business")){
                price = 10.90 * groupOfPeople;
            }else if (typeOfPeople.equals("Regular")){
                price = 15 * groupOfPeople;
            }
                break;
            case "Saturday":
                if (typeOfPeople.equals("Students")){
                    price = 9.80 * groupOfPeople;
                } else if (typeOfPeople.equals("Business")){
                    price = 15.60 * groupOfPeople;
                } else if (typeOfPeople.equals("Regular")){
                    price = 20 * groupOfPeople;
                }
                break;
            case "Sunday":
                if (typeOfPeople.equals("Students")){
                    price = 10.46 * groupOfPeople;
                } else if (typeOfPeople.equals("Business")){
                    price = 16 * groupOfPeople;
                } else if (typeOfPeople.equals("Regular")){
                    price = 22.50 * groupOfPeople;
                }
                break;
        }
        if (typeOfPeople.equals("Students") && (groupOfPeople >= 30)){
            price -= price * 0.15;
        }
        if (typeOfPeople.equals("Business") && (groupOfPeople >= 100)){
            groupOfPeople -= 10;
        }
        if (typeOfPeople.equals("Regular") && (groupOfPeople >= 10) && (groupOfPeople <=20)){
            price -= (price * 0.05);
        }
        System.out.printf(("Total price: %.2f"), price);
    }
}
