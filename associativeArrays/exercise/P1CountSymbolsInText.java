package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P1CountSymbolsInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> lettersCountMap = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == ' ') {
                continue;
            }

            if (!lettersCountMap.containsKey(currentLetter)) {
                lettersCountMap.put(currentLetter, 1);
            } else {
                int currentCount = lettersCountMap.get(currentLetter);
                lettersCountMap.put(currentLetter, 1 + currentCount);
            }
        }
        lettersCountMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}

//        String text = scanner.nextLine().replaceAll("\\s+", "");
//
//        Map<Character, Integer> symbolCount = new LinkedHashMap<>();
//
//        for (char symbol : text.toCharArray()) {
//            if(symbol == ' '){
//                continue;
//            }
//            if(!symbolCount.containsKey(symbol)){
//                symbolCount.put(symbol, 1);
//            }else{
//                int currentCount = symbolCount.get(symbol);
//                symbolCount.put(symbol, currentCount + 1);
//            }
//        }
//        symbolCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
//    }
//}
