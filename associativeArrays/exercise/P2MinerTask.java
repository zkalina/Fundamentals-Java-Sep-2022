package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P2MinerTask {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);


        String resource = scanner.nextLine();

        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        while(!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if(!resourceMap.containsKey(resource)){
                resourceMap.put(resource, quantity);
            }else{
               int currentQuantity = resourceMap.get(resource);
                resourceMap.put(resource, currentQuantity + quantity);
            }



            resource = scanner.nextLine();
            }


        resourceMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
