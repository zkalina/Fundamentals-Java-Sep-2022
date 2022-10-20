package arrays.practice;

import java.util.Arrays;
import java.util.Scanner;

public class P5EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer:: parseInt)
                            .toArray();
        int evenSum = 0;
        int oddSum = 0;
//        for (int i = 0; i < numbersArr.length; i++) {
//            if(numbersArr[i] % 2 == 0){
//                evenSum += numbersArr[i];
//            }else{
//                oddSum += numbersArr[i];
//            }
//        }
        for (int number : numbersArr) {
            if(number % 2 == 0) {
                evenSum += number;
            }else{
                oddSum += number;
            }
        }
        int diff = evenSum - oddSum;
        System.out.println(diff);
    }
}
