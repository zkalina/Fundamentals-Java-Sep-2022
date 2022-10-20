package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int pokesCount = 0;
        int originalPower = pokePower;

        while(pokePower >= distance){

            pokePower = pokePower - distance;
            pokesCount++;

            if(originalPower / 2 == pokePower){
                if(exhaustionFactor != 0) {
                    pokePower = pokePower / exhaustionFactor;
                }
            }
        }

            System.out.println(pokePower);
            System.out.println(pokesCount);

    }
}
