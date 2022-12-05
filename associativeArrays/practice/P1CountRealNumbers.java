package associativeArrays.practice;

import java.util.*;
import java.util.stream.Collectors;

public class P1CountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                        .map(Integer :: parseInt).collect(Collectors.toList());

        Map<Integer, Integer> numbersCountMap = new TreeMap<>();


        for (int i = 0; i < numbersList.size(); i++) {
            int currentNumber = numbersList.get(i);
            if(!numbersCountMap.containsKey(currentNumber)){
                numbersCountMap.put(currentNumber, 1);
            }else{
                numbersCountMap.put(currentNumber, numbersCountMap.get(currentNumber) + 1);
            }
        }
       numbersCountMap.entrySet().forEach(number -> System.out.println(number.getKey() + " -> " + number.getValue()));
    }
}
