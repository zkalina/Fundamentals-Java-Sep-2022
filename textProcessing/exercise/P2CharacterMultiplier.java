package textProcessing.exercise;

import java.util.Scanner;

public class P2CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        String firstWord = words[0];
        String secondWord = words[1];

        int sum = 0;

        sum = sumOfCharacterCodes(firstWord, secondWord);

        System.out.println(sum);

    }


    public static int sumOfCharacterCodes(String firstWord, String secondWord){

        char[] firstArr = firstWord.toCharArray();
        char[] secondArr = secondWord.toCharArray();

        int minLength = Math.min(firstArr.length, secondArr.length);
        int maxLength = Math.max(firstArr.length, secondArr.length);

        int sum = 0;
        for (int i = 0; i < minLength; i++) {

            sum += firstArr[i] * secondArr[i];
        }
        if(maxLength == firstArr.length){
            for (int i = minLength; i < maxLength; i++) {
                sum += firstArr[i];
            }
        }else{
            for (int i = minLength; i < maxLength; i++) {
                sum += secondArr[i];
            }
        }
        return sum;
    }
}
