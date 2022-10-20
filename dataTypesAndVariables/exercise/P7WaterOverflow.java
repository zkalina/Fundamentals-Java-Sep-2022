package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int waterLt = Integer.parseInt(scanner.nextLine());
            sum += waterLt;

            if(sum > 255){
                System.out.println("Insufficient capacity!");
                sum -= waterLt;
        }


        }
            System.out.println(sum);
    }
}
