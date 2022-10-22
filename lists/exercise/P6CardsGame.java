package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P6CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        10 20 30 40 50
//        50 40 30 30 10

        List<Integer> firstPlayerCardList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCardList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());

        while(firstPlayerCardList.size() > 0 && secondPlayerCardList.size() > 0){
            int firstCard = firstPlayerCardList.get(0);
            int secondCard = secondPlayerCardList.get(0);
            firstPlayerCardList.remove(0);
            secondPlayerCardList.remove(0);

            if (firstCard > secondCard){
                firstPlayerCardList.add(firstCard);
                firstPlayerCardList.add(secondCard);
            }else if (secondCard > firstCard){
                secondPlayerCardList.add(secondCard);
                secondPlayerCardList.add(firstCard);
            }
        }
        if (firstPlayerCardList.size() == 0){
            System.out.printf("Second player wins! Sum: %d", cardsSum(secondPlayerCardList));
        }else {
            System.out.printf("First player wins! Sum: %d", cardsSum(firstPlayerCardList));
        }



    }
    private static int cardsSum(List<Integer> cardsList){
        int sum = 0;
        for (int num : cardsList) {
            sum += num;
        }
        return sum;
    }
}
