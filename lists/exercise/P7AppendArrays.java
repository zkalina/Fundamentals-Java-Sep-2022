package lists.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> arraysList = Arrays.stream(input.split("\\|"))
                                    .collect(Collectors.toList());

        Collections.reverse(arraysList);

        System.out.println(arraysList.toString()
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }
}
