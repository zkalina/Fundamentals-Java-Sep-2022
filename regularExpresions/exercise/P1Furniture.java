package regularExpresions.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> furnitureList = new ArrayList<>();
        double totalPrice = 0;

        String regex = ">>(?<furniture>[A-Z]+[a-z]*)<<(?<price>[0-9]+\\.?[0-9]*)!(?<items>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        while(!text.equals("Purchase")){

            Matcher matcher = pattern.matcher(text);

            while(matcher.find()){
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                double item = Double.parseDouble(matcher.group("items"));


                furnitureList.add(furniture);
                double currentPrice = item * price;
                totalPrice += currentPrice;

            }

            text = scanner.nextLine();
        }
        System.out.println("Bought furniture: ");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);


    }
}
