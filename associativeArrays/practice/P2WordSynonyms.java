package associativeArrays.practice;

import java.util.*;

public class P2WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordsSynonymsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if(!wordsSynonymsMap.containsKey(word)){
                wordsSynonymsMap.put(word, new ArrayList<>());
            }
            wordsSynonymsMap.get(word).add(synonym);
        }
        wordsSynonymsMap.entrySet().forEach(word -> System.out.printf("%s - %s%n", word.getKey(), String.join(", ", word.getValue())));
    }
}
