package lists.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                                    .map(e-> Integer.parseInt(e))
                                    .collect(Collectors.toList());

        for (int i = numbersList.size() - 1; i >= 0; i--) {
            if (numbersList.get(i) < 0) {
                numbersList.remove(i);
            }else{
                System.out.print(numbersList.get(i) + " ");
            }
            if (numbersList.isEmpty()){
                System.out.println("empty");
            }

        }



    }
}
