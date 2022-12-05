package associativeArrays.practice;

import java.util.*;
import java.util.stream.Collectors;

public class P3OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().toLowerCase().split(" ")).collect(Collectors.toList());

        Map<String, Integer> elements = new LinkedHashMap<>();

        for (String word : words) {
            if (!elements.containsKey(word)) {
                elements.put(word, 1);
            } else {
                int currentCount = elements.get(word);
                elements.put(word, currentCount + 1);
            }

        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : elements.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", resultList));
    }

}
