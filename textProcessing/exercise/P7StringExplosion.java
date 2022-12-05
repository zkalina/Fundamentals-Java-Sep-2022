package textProcessing.exercise;

import java.util.Scanner;

public class P7StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder(input);
        int totalStrength = 0;
        for (int i = 0; i <= result.length() - 1; i++) {
            char symbol = result.charAt(i);

            if(symbol == '>'){
                int explosionStrength = Integer.parseInt(result.charAt(i + 1) + "");// сила на експлозията
                totalStrength += explosionStrength;

            }else if(symbol != '>' && totalStrength > 0){
                result.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(result.toString());
    }
}
