package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());

        double maxSnowballValue = Double.MIN_VALUE;
            int biggestSnowballSnow = 0;
            int biggestSnowballTime = 0;
            int biggestSnowballQuality = 0;

        for (int snowball = 1; snowball <= snowballs; snowball++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

           double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxSnowballValue){
                maxSnowballValue = snowballValue;
                biggestSnowballSnow = snowballSnow;
                biggestSnowballTime = snowballTime;
                biggestSnowballQuality = snowballQuality;

            }

        }

        System.out.printf("%d : %d = %.0f (%d)", biggestSnowballSnow, biggestSnowballTime, maxSnowballValue,
                biggestSnowballQuality);
    }

}
