package textProcessing.exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class P5MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal firstNumber = new BigDecimal(scanner.nextLine());
        BigDecimal secondNumber =  new BigDecimal(scanner.nextLine());
    BigDecimal result = (firstNumber.multiply(secondNumber));


        System.out.println(result);
    }
}
