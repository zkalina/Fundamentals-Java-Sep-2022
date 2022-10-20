package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer :: parseInt)
                            .toArray();

        boolean isTop = false;
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            int currentNumber =  numbersArr[i];
            if(i == numbersArr.length - 1) {
                System.out.println(currentNumber);
                break;
            }
            for (int j = i + 1; j <= numbersArr.length - 1; j++) {
                int nextNumber = numbersArr[j];
                if (currentNumber > nextNumber){
                    isTop = true;
                }else{
                    isTop = false;
                    break;
                }
            }
            if(isTop){
                System.out.print(currentNumber + " ");
            }
        }
    }
}
