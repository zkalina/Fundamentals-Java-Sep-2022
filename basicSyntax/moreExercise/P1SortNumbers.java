package basicSyntax.moreExercise;

import java.util.Scanner;

public class P1SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int firstNumber = Integer.parseInt(scanner.nextLine());
    int secondNumber = Integer.parseInt(scanner.nextLine());
    int thirdNumber = Integer.parseInt(scanner.nextLine());

    if (firstNumber > secondNumber && firstNumber > thirdNumber){
        System.out.println(firstNumber);
        if (secondNumber > thirdNumber){
            System.out.println(secondNumber);
            System.out.println(thirdNumber);
        }else{
            System.out.println(thirdNumber);
            System.out.println(secondNumber);
        }
    }if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber);
            if(firstNumber > thirdNumber){
                System.out.println(firstNumber);
                System.out.println(thirdNumber);
            }else{
                System.out.println(thirdNumber);
                System.out.println(firstNumber);
            }
        }if(thirdNumber > secondNumber && thirdNumber > firstNumber){
            System.out.println(thirdNumber);
            if(secondNumber > firstNumber){
                System.out.println(secondNumber);
                System.out.println(firstNumber);
            }else{
                System.out.println(firstNumber);
                System.out.println(secondNumber);
            }
        }

    }
}
