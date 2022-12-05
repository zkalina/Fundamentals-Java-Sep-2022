package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P7LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> materialItemMap = new LinkedHashMap<>();
        Map<String, Integer> junkItemsMap = new LinkedHashMap<>();

        materialItemMap.put("shards", 0);
        materialItemMap.put("fragments", 0);
        materialItemMap.put("motes", 0);

        boolean isWin = false;

        while(!isWin) {
            String[] input = scanner.nextLine().toLowerCase().split(" ");
            for (int i = 0; i < input.length; i+=2) {
                String material = input[i + 1];
                int quantity = Integer.parseInt(input[i]);

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materialItemMap.get(material);
                    materialItemMap.put(material, currentQuantity + quantity);
                } else {
                    if (!junkItemsMap.containsKey(material)) {
                        junkItemsMap.put(material, quantity);
                    } else {
                        int currentQuant = junkItemsMap.get(material);
                        junkItemsMap.put(material, currentQuant + quantity);
                    }
                }
                if (materialItemMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materialItemMap.put("shards", materialItemMap.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materialItemMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialItemMap.put("fragments", materialItemMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materialItemMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialItemMap.put("motes", materialItemMap.get("motes") - 250);
                    isWin = true;
                    break;
                }

            }
                if(isWin){
                break;
                }
             }

        materialItemMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkItemsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        }

}
