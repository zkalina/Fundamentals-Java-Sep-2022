package lists.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer :: parseInt)
                                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            int firstNum = numbersList.get(i);
            int secondNum = numbersList.get(i + 1);

            if(firstNum == secondNum){
               numbersList.set(i, firstNum + secondNum);
               numbersList.remove(i + 1);
               i = -1;
            }
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
