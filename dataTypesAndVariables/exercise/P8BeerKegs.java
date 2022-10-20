package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        double biggestKeg = Double.MIN_VALUE;
        String currentModel = "";

        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if(volume >= biggestKeg){
                biggestKeg = volume;
                currentModel = model;
            }
        }
        System.out.println(currentModel);





    }
}
