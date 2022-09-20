package basicsyntax.practice;

import java.util.Scanner;

public class P4BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min += 30;

        if (min >= 60){
            min -= 60;
            hours += 1;
        }
        if (hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, min);
    }
}

