package basicsyntax.practice;

import java.util.Scanner;

public class P1StudentInformation {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

                String studentsName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                double grade = Double.parseDouble(scanner.nextLine());

     String data = String.format("Name: %s, Age: %d, Grade: %.2f", studentsName, age, grade);

        System.out.println(data);

        //System.out.printf("Name: %s, Age: %d, Grade: %.2f", studentsName, age, grade);
    }
}
