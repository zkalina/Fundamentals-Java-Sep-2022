package dataTypesAndVariables.practice;

import java.util.Scanner;

public class P5ConcatNames {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();

//        String fullName = String.format("%s%s%s", firstName, delimiter, lastName);

        System.out.println(firstName +delimiter + lastName);
    }
}
