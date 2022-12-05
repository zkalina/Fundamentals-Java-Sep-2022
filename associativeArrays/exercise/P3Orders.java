package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P3Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    Map<String, Double> productPriceMap = new LinkedHashMap<>();
    Map<String, Double> productQuantityMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

    while(!input.equals("buy")){
        String product = input.split(" ")[0];
        Double price = Double.parseDouble(input.split(" ")[1]);
        Double quantity = Double.parseDouble(input.split(" ")[2]);

        productPriceMap.put(product, price);

        if(!productQuantityMap.containsKey(product)){
           productQuantityMap.put(product, quantity);
        }else{
            productQuantityMap.put(product, productQuantityMap.get(product) + quantity);
        }
        input = scanner.nextLine();
    }
    for(Map.Entry<String, Double> entry : productPriceMap.entrySet()){
        String name = entry.getKey();
        double sum = entry.getValue() * productQuantityMap.get(name);
        System.out.printf("%s -> %.2f%n", name, sum);
       }
    }
}
