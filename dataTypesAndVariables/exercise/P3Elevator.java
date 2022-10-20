package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class P3Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int courseCapacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil((double)people / courseCapacity);

        System.out.printf("%.0f", courses);
    }
}
