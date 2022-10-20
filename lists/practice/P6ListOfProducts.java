package lists.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P6ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = Arrays.stream(scanner.nextLine().split(" "))
                            .map(e -> Integer.parseInt(e))
                            .collect(Collectors.toList());

        Collections.sort(products);

    }
}
