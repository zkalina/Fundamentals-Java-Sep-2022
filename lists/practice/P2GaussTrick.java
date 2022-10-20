package lists.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer :: parseInt)
                                .collect(Collectors.toList());

        int firstSize = numbersList.size();
        for (int i = 0; i < firstSize / 2; i++) {
            int firstNumber = numbersList.get(i);
            int secondNumber = numbersList.get(numbersList.size() - 1);
            int sum = firstNumber + secondNumber;
            numbersList.set(i, sum);
            numbersList.remove(numbersList.size() - 1);
        }
        for ( int item :numbersList) {
            System.out.print(item + " ");
        }
    }
}
